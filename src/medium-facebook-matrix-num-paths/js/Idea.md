# Idea behind the solution

Let `s(n, m)` be the number of paths for a matrix of size `n`, `m`. Knowing that `s(2, 2) = 4`, it can be shown that the solution for `s(2, 2) = s(1, 2) + s(2, 1)`.

First, consider the matrix `2x2`:

```
0   0
0   0
```

At the top-left corner we have only 2 options, first start going right or going down. If we choose start going right, the remaining possibilities would look like:

```
0
0
```

Therefore, we need to solve the number of paths for the matrix `2x1`

On the other hand, if we had choosen to go down, the remaining possibilities would be as follows:

```
0   0
```

In other words, the matrix `1x2` is left.

Clearly, the number of paths for the matrix `2x1` and `1x2` to go to it's `bottom-right` is `1` and `1` respectively. Combining those 2 solutions, the possibilities for `s(2, 2) = s(1, 2) + s(2, 1) = 2`.

Applying the same logic for the matrix `3x2`:

```
0   0   0
0   0   0
```

`s(3, 2) = s(2, 2) + s(3, 1) = 2 + 1 = 5`

For the matrix `3x3`:

```
0   0   0
0   0   0
0   0   0
```

`s(3, 3) = s(3, 2) + s(2, 3) = 5 + 5 = 10`.

Note that, by remembering small solutions we can quickly calculate the number of paths for the current matrix. This is an instance of Dynamic Programming. By using a table `s[i][j]` that gives the solution for the matrix `ixj`, we can fill this table starting from s[1][1] until we get to the desidered size.
