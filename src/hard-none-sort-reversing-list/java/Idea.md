# Idea behind the solution

The idea is to start from left to right (index `i`) and at each step find the index `j` of the smaller element and then reverse the list from `i` to `j`. This will move the smaller element at `j` to position `i`. Doing this with `i` going from 0 to the end of the list will sort the list since at every step we are taking the smaller element from the sublist and moving it to the left.

The algorithm goes from left to right in `n` steps, for `n` being the length of the list. Each step requires `n - i` operations, where `i` is the current index while going from left to right. It requires `j - i` operations to reverse the list, where `j` is the index of the smaller element. The worst case is if we have to reverse the whole list everytime, so `n - i` and `j - i` is bounded to `n`. Thefeore the running complexity is `n * (n + n)`, i.e., `n` steps to go fro left to right, `n + n` steps to find and reverse the list.

The running complexity is `O(n ^ 2)` and space complexity is `O(1)`.
