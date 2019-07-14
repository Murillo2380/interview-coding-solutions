# Idea behind the solution

Here the idea is to get a set of intervals in which we can generate numbers.

We first start by creating a set of intervals that does not contain any number in the banned list.

Say, the banned list is:

```
[2, 6, 8]
```

And `n = 10`, we will have the following intervals that can be used to generate numbers:

```
[0, 1], length = 2
[3, 5], length = 3
[7, 7], length = 1
[9, 9], length = 1
```

Now we have the intervals, we need to calculate the probability to choose a number in that interval, and then, randomize a number within the chosen interval.

In this example the domain is `n - |bannedNumbers| = 10 - 3 = 7` numbers. Each interval has, respectively, the probability of `2/7, 3/7, 1/7 and 1/7` to be chosen.

To generate a number, we first generate a number from `0 to 1`. Then, if the number is:

-   Between `0` and `2/7` randomize a number in `[0, 1]`
-   Between `2/7`, and `5/7`, randomize a number in `[3, 5]`
-   Between `5/7` and `6/7`, randomize a number in `[7, 7]`.
-   Between `6/7, 7/7`, randomize a number in `[9,9]`.

We do this by maintaining a list `p` of a cumulative probabilitites:

```js
p[-1] = 0;

for (i = 0; i < numIntervals; i++) {
    p[i] = p[i - 1] + interval[i] / domainSize;
}
```

To randomize a number in `[0, n-1]` that is not in the banned list, choose a number `r` in `[0,1]` and do a binary search to get the index `i` where `p[i-1] < r <= p[i]`. Then, choose a number in the interval `i`.

This algorithm runs in `O(k)` (`k = bannedList.length`) to generate `k` intervals, plus `O(k)` to create the list `p`. To generate a number, we need to choose an interval with a binary search, therefore, `O(log k)`.

Space complexity is `O(k)` to maintain the intervals and the list of probabilities.
