# Idea behind the solution

A non-decreasing array requires that, for every `i-th` element in the array, it is true that `v[i] < v[i+1]`. We are only allowed to change at most 1 number in an array to turn it into a non-decreasing, therefore, at most one `v[i] < v[i+1]` can be `false`.

If in a given array only one `v[i] < v[i+1]` is `false`, then `v[i-1] < v[i]` is `true`, for `i > 0`. To be possible to turn the given array into a non-decreasing, we need to change `v[i]` to a number such that `v[i-1] < v[i] < v[i+1]` is `true`. Since the problem states the given array is an array of integers, it is enough to verify if `v[i + 1] - v[i-1] > 1`, i.e, if there exists a number between `v[i-1]` and `v[i+1]` that can be used to assign to `v[i]` such that `v[i-1] < v[i] < v[i+1]` is `true`, for some `i > 0`. If `i = 0`, we don't need to do the above check since we can pick any integer number lesser than `v[i+1]`.

This solutions runs in `O(n)` for `n` being the length of the array, since we visit each array element only once.
