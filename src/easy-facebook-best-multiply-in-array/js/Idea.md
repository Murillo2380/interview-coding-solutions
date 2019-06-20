# Idea behind the solution

The idea is straight forward, we just need to test all the numbers. It is possible to optimize the algorithm a little bit by using memoization with the first 2 numbers in the multiplication chain.

The running time of this algorithm is **O(n^3)** since we test `n` numbers against all the others `n-1` and `n-2` numbers in the array.
