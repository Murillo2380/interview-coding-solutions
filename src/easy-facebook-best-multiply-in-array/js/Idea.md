# Idea behind the solution

The idea is straight forward, we just need to test all the numbers. It is possible to optimize the algorithm a little bit by using memoization with the first 2 numbers in the multiplication chain.

The running time of this algorithm is **O(n^3)** since we test `n` numbers against all the others `n-1` and `n-2` numbers in the array.

Another solution is go through the array only once and keep tracking the **3 greatest positive numbers**, the **3 smaller negative numbers** and the **3 greatest negative numbers** and return the result considering if there is any positive number in the array or not. Using this strategy, the running time of the algorithm is **O(n)** since we only pass in the array once checking the possible results at the end.
