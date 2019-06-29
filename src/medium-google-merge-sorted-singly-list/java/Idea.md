# Idea behind the solution

This problem is simple to solve. We just need an array of `k` linked lists and while there are elements in any of the lists, simply remove the smaller element from all the lists and append it to the solution.

This algorithm runs in `O(n)`, for `n` being the length of the biggest linked list.
