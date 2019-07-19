# Idea behind the solution

The idea is to pass on the array and add each number to a set of numbers. For each number `m` we are checking we need to verify if the number `k - m` exists in the set. If exists, then there are 2 numbers that sums to `k`.

The solution takes O(1) to insert the number in the set and O(n) to pass through the array.
