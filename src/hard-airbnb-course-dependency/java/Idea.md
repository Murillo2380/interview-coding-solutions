# Idea behind the solution

The idea here is to do a [Topological sorting](https://en.wikipedia.org/wiki/Topological_sorting).

We basically need to imagine each course as being a node in a directed graph. When `a` has a prerequisite of `b`, we create a link from `b` to `a`.

We look for nodes that does not have any prerequisite (incident edge), add it to the output and remove it from the graph. Do this until the graph is empty.

This code runs in `O(n)` to search for nodes without any incident edge, adding it to a queue. Then, for each node `n` in the queue we remove it from the graph. After removing `n` we need to check each neighbour `e` of `n` and see if now the node `e` has no prerequisite. If not, add it to the queue. For each node `n` we do `|e|` operations that can be up to `n-1`.

Therefore, the running time of this algorithm is `O(n) + O(n * (n-1))` = `O(n) + O(n^2)` = `O(n^2)`.
