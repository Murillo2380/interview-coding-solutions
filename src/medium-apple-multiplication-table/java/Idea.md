# Idea behind the solution

We can simply check the divisors of the given X and count how many of those divisors multiplied by each other gets X.

For the `i-th` divisor we check all the previous `j-th` divisor, for `0 <= j <= i`. When `divisor_i * divisor_j == X` is `false` for every `j` in the on going iteration, we can return the current count since `divisor_i` will be smaller in the next iteration and every upcoming check of `divisor_i * divisor_j == X` will be `false`.

The running time in the worst case is `O(n^2)` for n being the length of the matrix.
