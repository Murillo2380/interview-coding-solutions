# Idea behind the solution

Since we need to compare the tree `T` with every subtree of `S`, we can do [deep first search](https://en.wikipedia.org/wiki/Tree_traversal) to find every subtree of `S`.

For each subtree we compare whether it has the same structure as `T`. We can use a [preorder transversal](https://en.wikipedia.org/wiki/Tree_traversal) for this.

The running complexity is `O(n)` to find `n` subtrees in `S` and, for each subtree, `O(m)` to compare both trees, therefore, `O(n * m)`.

The space complexity is `O(h + m)`, where `h` is the height of `S` (since we are using recursion, which go down `h` times) and, for every subtree of `S` we create 2 stacks os size `m` to compare both trees.
