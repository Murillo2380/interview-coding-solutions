# Idea behind the solution

The solution is simple, it is just required to, for each number in the array, check the maximum number in the rest of the array and calculate the difference.

The solution is the higher difference. We don't need to check the left part of the array since the problem states it is in the "chronological order", therefore, you cannot sell something you bought today for the price it was yesterday.

For an array of size `n`, for each number of index `k` we check the remaining `n-k` numbers. Therefore, the solution is **O(n^2)** (similar to the [insertion sort](https://pt.wikipedia.org/wiki/Selection_sort)).
