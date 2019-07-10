# Idea behind the solution

Here, each node must be greater or equal than the max value on its left and must be lesser than the minimum value on its right subtree.

For each node we mark the minimum and maximum interval that subtree is holding, then we just need to do the above check for each node.

The time and space complexity is `O(n)` since we visit each node once.
