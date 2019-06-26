# Idea behind the solution

For this problem we simply need to build a stack of nodes and pop every element, appending each element from the stack at the end of the linked list.

This algorithm needs `O(n)` space to run and runs on `O(n^2)` where `n` is the number of elements in the linked list. The algorithm can be improved to run in `O(n)` by tracking the tail of the list to improve the insertion performance.
