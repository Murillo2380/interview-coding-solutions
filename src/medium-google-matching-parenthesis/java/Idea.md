# Idea behind the solution

The solution was inspired by the [Shunting yard algorithm](https://en.wikipedia.org/wiki/Shunting-yard_algorithm) from **Edsger Dijkstra**. This algorithm is used for solving mathematical expressions to produce a Polish Notation from the given conventional notation. It deals perfectly with matching parenthesis.

We basically need to stack every `(` and pop the top of the stack for every `)`. If the stack is empty while trying to pop the top of it, then there is a `)` not being openend by an `(`. If there is any `(` in the stack, them we have `(` not being closed by any `)`. The result is the sum of the size of the stack and how many times we failed to pop the top of the stack because it was empty.
