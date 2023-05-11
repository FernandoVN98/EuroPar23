import numpy as np
from trees.tasks import *
from dislib.data.array import Array
from pycompss.api.constraint import constraint
from pycompss.api.api import compss_delete_object, compss_barrier, compss_wait_on

def generate_ranges(num_buckets, range_min, range_max):
    """
    Generate the ranges of each bucket.
    The ranges structure:
        [(0, a), (a, b), ..., (m, n)]
        * Where (a - 0) == (b - a) == ...
    :return: Ranges of the buckets
    """
    split_indexes = np.linspace(range_min, range_max+1, num_buckets + 1)
    ranges = []
    for ind in range(split_indexes.size - 1):
        ranges.append((split_indexes[ind], split_indexes[ind + 1]))
    return ranges


def terasorting(dataset, indexes_to_try, num_buckets, range_min=0, range_max=1, indexes_selected=None, reg_shape=None):
    # Init buckets dictionary
    list_of_buckets = []
    total_fragments = []
    if indexes_selected is not None:
        for idx, d in enumerate(dataset):
            fragment_buckets = [[object() for _ in range(num_buckets)] for _ in range(len(indexes_to_try))]
            idx_selected = indexes_selected[indexes_selected < (idx + 1) * reg_shape]
            filter_fragment(d, fragment_buckets, indexes_to_try, num_buckets, range_min=range_min._blocks, range_max=range_max._blocks,
                            indexes_selected=idx_selected[idx_selected >= (idx) * reg_shape] % reg_shape)
            total_fragments.append(fragment_buckets)
        total_fragments = np.array(total_fragments)
        for index in range(len(indexes_to_try)):
            buckets = {}
            for i in range(num_buckets):
                buckets[i] = []
            for i in range(num_buckets):
                buckets[i].append(total_fragments[:, index, i])
            list_of_buckets.append(buckets)
    else:
        buckets = {}
        for d in dataset:
            fragment_buckets = [[object() for _ in range(num_buckets)] for _ in range(len(indexes_to_try))]
            filter_fragment(d, fragment_buckets, indexes_to_try, num_buckets, range_min=range_min._blocks,
                            range_max=range_max._blocks)
            total_fragments.append(fragment_buckets)
        total_fragments = np.array(total_fragments)
        for index in range(len(indexes_to_try)):
            buckets = {}
            for i in range(num_buckets):
                buckets[i] = []
            for i in range(num_buckets):
                buckets[i].append(total_fragments[:, index, i])
            list_of_buckets.append(buckets)
    result = dict()
    real_key = 0
    for index in range(len(indexes_to_try)):
        for key, value in list(list_of_buckets[index].items()):
            result[real_key] = combine_and_sort_bucket_elements(value[0])
            real_key += 1
    [compss_delete_object(future_objects) for value in buckets.items() for future_objects in value[1]]
    return_list = []
    for idx, value in enumerate(result.values()):
        if idx%num_buckets == 0:
            return_list.append([])
        return_list[-1].append(value)
    return return_list


def terasort(dataset, indexes_to_try, range_min=0, range_max=1, indexes_selected=None, num_buckets=4):
    """
    ----------------------
    Terasort main program
    ----------------------
    This application generates a set of fragments that contain randomly
    generated key, value tuples and sorts them all considering the key of
    each tuple.

    :param num_fragments: Number of fragments to generate
    :param num_entries: Number of entries (k,v tuples) within each fragment
    :param num_buckets: Number of buckets to consider.
    :param seed: Initial seed for the random number generator.
    """
    if isinstance(dataset, Array):
        result = terasorting(dataset._blocks, indexes_to_try, num_buckets,
                             range_min=range_min,
                             range_max=range_max, indexes_selected=indexes_selected,
                             reg_shape=dataset._reg_shape[0])
        return np.array(result)
    else:
        result = terasorting(dataset, indexes_to_try, num_buckets, range_min=range_min, range_max=range_max)
        return np.array(result)

@constraint(computing_units="${ComputingUnits}")
@task(block_x=COLLECTION_IN, returns=1)
def obtain_index_from_blocks(block_x, index):
    if block_x[0] is None:
        return None
    else:
        block_x = np.block(block_x)
        return block_x[:, index]