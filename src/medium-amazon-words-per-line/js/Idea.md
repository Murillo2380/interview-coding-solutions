# Idea behind the solution

The idea is basically be greedy and put as many words as possible in the same line, which will allow the next line to have fewer words as possible to fit.

it is not clear exactly what to do when a big word doesn't fit (maybe set `null` in the position it would be placed or discart all the words that was separated) and return `null`.
