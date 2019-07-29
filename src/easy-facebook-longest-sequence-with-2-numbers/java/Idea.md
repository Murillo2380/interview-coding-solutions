# Idea behind the solution

The idea here is to pass throught the array `v` and checking for how long we can iterate starting from an index `i` while there are only 2 numbers in the on going iteration.

While we iterate starting from index i, we also keep tracking how many repeated numbers there are behind index `i`. So, consider a table `t` where:

```js
t[i] = 1; // if i = 0 || v[i] != v[i-1]
t[i] = t[i - 1] + 1; // if i > 0 && v[i] == v[i-1]
```

In this way, we can start from `i` and iterate until we are finding only 2 repeated numbers in the sequence. If the sequence ends on `j` (such that the number in position `j` was the number that broke the sequence), then the sequence length of 2 repeated numbers is:

```js
j - i + t[i] - 1;
```

Where `(j - i)` is the length of the sequence, plus the amount of repeated numbers before `i` that are the same as `v[i]`, `-1` because we are counting `v[i]` twice.

The solution is the greatest sequence length we found doing this calculations.

This code passes once on each number in the given array of size `n`, plus another array of size `n` for the counting. The code runs in `O(n)` and requires `O(n)` space.
