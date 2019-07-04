# Idea behind the solution

For this problem we just need to iterate over each position in the matrix. If the current cell is 1, then use the [flood-fill](https://en.wikipedia.org/wiki/Flood_fill) algorithm to paint the whole island with `-1` (visited).

The solution is the number of floods made.
