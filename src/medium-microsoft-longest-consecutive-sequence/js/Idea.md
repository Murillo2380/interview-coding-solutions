# Idea behind the solution

The main point is to pass throught the array once and mark in a Hash Table which number exists. It requires O(n) to fill the hash table.

Then, we loop again on the array and we look for a number that represents the beginning of the interval, in other words, a number where its predecessor doesn't exists. When we find him, we start to count as long as a successor exists.

In this example:

```js
[100, 4, 200, 1, 3, 2];
```

The hash table would be:

```js
{
    100: true
    4: true
    200: true
    1: true
    3: true
    2: true
}
```

The numbers without a predecessors are: `100`, `200` and `1`. Count the number of successors starting from `100`, `200` and `1` yelds, respectively: `1` (from 100 to 100), `1` (from 200 to 200) and `4` (from 1 to 4). The answer is the greatest number.

This logic will iterate on each number of the array. If the number is doesn't have an interval, then it will pass on its successors. The worst case is when we are given a sorted array, we will iterate twice on the entire array (one on the first pass to check if there is a predecessor or not, then another one to count the numbers of successors from the smallest number).
Yet, it is still O(n) because the algorithm will run once for each element to build the hash table and another two times to find the solution.
