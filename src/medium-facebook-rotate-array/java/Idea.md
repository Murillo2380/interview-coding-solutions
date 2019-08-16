# Idea behind the solution

The idea of this algorithm is based on the bubble sort. If we need to rotate the list by k elements we first check if we need to rotate left or right if `k < list.length / 2`.

To rotate left, we just need to go from `0` to `list.length - k`, swapping the current element with the element `k` positions after. Example if `k = 2`:

```

[1, 2, 3, 4, 5, 6]
 ^     ^
 |     |
 |     |
 i    i+k

[3, 2, 1, 4, 5, 6]
    ^     ^
    |     |
    |     |
    i    i+k

[3, 4, 1, 2, 5, 6]
       ^     ^
       |     |
       |     |
       i    i+k

[3, 4, 5, 2, 1, 6]
          ^     ^
          |     |
          |     |
          i    i+k

[3, 4, 5, 6, 1, 2]
             ^     ^
             |     |
             |     |
             i    i+k
```

The same logic applies for shifting the array from right to left, but starting from `list.length - 1` and ending on `k`.

This algorithm runs in O(n) since it pass once for each element in the array, swapping 2 elements in each iteration.
