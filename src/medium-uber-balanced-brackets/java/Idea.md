# Idea behind the solution

The solution was inspired by the [Shunting yard algorithm](https://en.wikipedia.org/wiki/Shunting-yard_algorithm) from **Edsger Dijkstra**.

We basically push to the stack any opening bracket and for each closing bracket we verify if the closing bracket matches what is on the top of the stack. If does not match, then return false.

At the end the stack must be empty, so the number of closing bracket matches the number of opening brackets.

This algorithms runs in `O(n)` where n is the length of the string, and needs `O(n)` space for the stack.
