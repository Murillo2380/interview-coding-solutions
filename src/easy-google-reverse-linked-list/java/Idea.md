# Idea behind the solution

Consider this list:
```
1 -> 2 -> 3 -> 4 -> 5
```
The reverse would be:
```
5 -> 4 -> 3 -> 2 -> 1
```
or
```
1 <- 2 <- 3 <- 4 <- 5
```

Note that it is just needed to reverse the arrow's direction, in other words, having a node `n`, do `n.next = n.previous`. Considering that we don't have access do the previous element, we just need another variable to keep tracking who is the previous element in the list.

At the end, just update the head of the list to be the last node. This algorithm runs once for each node, thus it runs in `O(n)`.