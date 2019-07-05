# Idea behind the solution

For this problem we just need to apply [Breadth first search](https://en.wikipedia.org/wiki/Breadth-first_search) and return the last used node from the queue.

If you imagine the tree to be implemented not with nodes, but as an array (just like in the [Heapsort](https://en.wikipedia.org/wiki/Heapsort)), you will notice the deepest element is also the last element in the array.

Considering we have nodes and not a flat array, putting the nodes in a queue (with the **Breadth first search**) will build a queue just like the heapsort would do, with the deepest element being the last one.
