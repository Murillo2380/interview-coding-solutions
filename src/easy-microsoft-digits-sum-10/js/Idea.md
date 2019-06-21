# Idea behind the solution

Here a list of the perfect numbers:

```
19    28    37    46    55    64    73    82    91    109    118    127    136    145    154    163    172    181    190    208  ...  802    901    910    1009    1018
```

Notice that, the difference of each number is `9`. Therefore, looping with a step of 9 and checking if its digits sums up to 10 is faster than just testing every natural number.

Regardless this little tweak, this algorithm still runs in `0(n)`

There must be a way to do it in `O(1)`, but there are some problems to solve. Consider the following sequence:

```
... 172 181 190 *199* 208 ...
```

Notice that **199** is not a correct, yet, summing up `9` will get us `208` which is correct. The same happens for the number `100`, `919`, `1000`, etc. There are some numbers that must be skipped.

The formula to find the `n-th` perfect number seems something like:

```
f(n) = 19 + (n-1) + 9 * g(n)
```

Where `g(n)` is a function that, given `n`, will return the number of _**numbers we should skip**_ because the sum of its digits fails to be 10 like said earlier, but this function is unknown to the author.
