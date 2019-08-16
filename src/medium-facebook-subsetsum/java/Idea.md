# Idea behind the solution

For each element there is only 2 options:

-   The element belongs to set A
-   The element does not belong to the set A

To verify if it is possible to divide the multiset into 2 subsets with equal sum, the total sum must be even so it is possible to have half of the sum in one set and the other half in the other set.

The brute-force technique would do something as follows:

```java

    boolean canBeDivided(int[] multiset) {
        int sum = Arrays.stream(multiset).sum();

        if(sum % 2 != 0)
            return false;

        return hasSubsetSum(multiset, multiset.length, sum / 2); // Ask if there is a subset which sums to the half of the total sum.
    }

    boolean hasSubsetSum(int[] multiset, int n, int sum) {
        if(sum == 0)
            return true;
        if(sum < 0 || n == 0)
            return false;

        return hasSubsetSum(multiset, n - 1, sum) || hasSubsetSum(multiset, n - 1, sum - multiset[n - 1]); // First test with the last element or remove it and test it again
    }

```

Since each element can be present or not in the array, the number of possibilities is `O(2^n)`. What it is possible to do is use a cache (dinamic programming) to save recursions that has been already calculated. To do this, we just need to create a table to store its value.

The table will have the size `n x sum / 2` and each time we calculate any value we save it in the table. Before calculating any recursion we first check if the value has been already calculated and use it, otherwise, compute it and store the result in the table.

The worst case is to fill the whole table, the run and space complexity will be `O(n * sum)`.
