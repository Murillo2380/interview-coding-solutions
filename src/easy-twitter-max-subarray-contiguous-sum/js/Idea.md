# Idea behind the solution

The idea here is to be greedy and keep summing the numbers in the array as long as it makes the current total better.

If the sum until `i-1` is `t` and `t + v[i]` yelds a negative number, then we do better forgetting every number from `0` to `i` and start a new
sum from `i+1`. At the end, the result is the max sum found during this operation.

Since we do not use any auxiliar table, the space complexity is `O(1)` and the code is `O(n)` since we compute every element in the array only once.
