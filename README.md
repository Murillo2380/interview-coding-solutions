# interview-coding-solutions

Solutions to some interview problems that I found somewhere. The solutions will be posted along with the source.

## Motivation

This repo exists to share some solutions I've implemented, along with the question description.

## Running the code

Navigate to the desired folder's solution and then, execute the following for the desired language:

-   **JavaScript**

```bash
node solution.js
```

-   **Java**

```bash
javac Solution.java
java Solution
```

## Contributing

TODO (basically I think it will be a simple pull request with your solution in a file like `solution.x`).

## Problems

### medium-microsoft-longest-consecutive-sequence

[JavaScript Solution](./src/medium-microsoft-longest-consecutive-sequence/js/solution.js)
[JavaScript Solution Idea](./src/medium-microsoft-longest-consecutive-sequence/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Microsoft**.

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example, given `[100, 4, 200, 1, 3, 2]`, the longest consecutive element sequence is `[1, 2, 3, 4]`. Return its length: `4`.

Your algorithm should run in `O(n)` complexity.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-square-fair-coin-toss

[JavaScript Solution](./src/medium-square-fair-coin-toss/js/solution.js)
[JavaScript Solution Idea](./src/medium-square-fair-coin-toss/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Square**.

Assume you have access to a function `toss_biased()` which returns `0` or `1` with a probability that's not `50-50` (but also not `0-100` or `100-0`). You do not know the bias of the coin.

Write a function to simulate an unbiased coin toss.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-microsoft-digits-sum-10

[JavaScript Solution](./src/easy-microsoft-digits-sum-10/js/solution.js)
[JavaScript Solution Idea](./src/easy-microsoft-digits-sum-10/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Microsoft**.

A number is considered perfect if its digits sum up to exactly `10`.

Given a positive integer `n`, return the `n-th` perfect number.

For example, given `1`, you should return `19`. Given `2`, you should return `28`.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-google-mirror-tree

[Java Solution](./src/medium-google-mirror-tree/java/Solution.java)
[Java Solution Idea](./src/medium-google-mirror-tree/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by Google.

Invert a binary tree.

For example, given the following tree:

```
    a
   / \
  b   c
 / \  /
d   e f
```

should become:

```
  a
 / \
 c  b
 \  / \
  f e  d
```

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-facebook-best-multiply-in-array

[JavaScript Solution](./src/easy-facebook-best-multiply-in-array/js/solution.js)
[JavaScript Solution Idea](./src/easy-facebook-best-multiply-in-array/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Facebook**.

Given a list of integers, return the largest product that can be made by multiplying any three integers.

For example, if the list is `[-10, -10, 5, 2]`, we should return `500`, since that's `-10 * -10 * 5`.

You can assume the list has at least three integers.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-google-special-chess-bishop

[JavaScript Solution](./src/medium-google-special-chess-bishop/js/solution.js)
[JavaScript Solution Idea](./src/medium-google-special-chess-bishop/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

On our special chessboard, two bishops attack each other if they share the same diagonal. This includes bishops that have another bishop located between them, i.e. bishops can attack through pieces.

You are given `N` bishops, represented as `(row, column)` tuples on a `M` by `M` chessboard. Write a function to count the number of pairs of bishops that attack each other. The ordering of the pair doesn't matter: `(1, 2`) is considered the same as `(2, 1)`.

For example, given `M = 5` and the list of bishops:

```
(0, 0)
(1, 2)
(2, 2)
(4, 0)
```

The board would look like this:

```
[b 0 0 0 0]
[0 0 b 0 0]
[0 0 b 0 0]
[0 0 0 0 0]
[b 0 0 0 0]
```

You should return `2`, since bishops `1` and `3` attack each other, as well as bishops `3` and `4`.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### hard-google-least-recently-used-cache

[JavaScript Solution](./src/hard-google-least-recently-used-cache/js/solution.js)
[JavaScript Solution Idea](./src/hard-google-least-recently-used-cache/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

Implement an LRU (Least Recently Used) cache. It should be able to be initialized with a cache size n, and contain the following methods:

-   `set(key, value)`: sets key to value. If there are already n items in the cache and we are adding a new item, then it should also remove the least recently used item.
-   `get(key)`: gets the value at key. If no such key exists, return null.

Each operation should run in `O(1)` time.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-microsoft-operation-tree

[JavaScript Solution](./src/easy-microsoft-operation-tree/js/solution.js)
[JavaScript Solution Idea](./src/easy-microsoft-operation-tree/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Microsoft**.

Suppose an arithmetic expression is given as a binary tree. Each leaf is an integer and each internal node is one of '+', '−', '∗', or '/'.

Given the root to such a tree, write a function to evaluate it.

For example, given the following tree:

```
    *
   / \
  +    +
 / \  / \
3  2  4  5
```

You should return **45**, as it is **(3 + 2) \* (4 + 5)**.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-google-pow

[JavaScript Solution](./src/medium-google-pow/js/solution.js)
[JavaScript Solution Idea](./src/medium-google-pow/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

Implement integer exponentiation. That is, implement the `pow(x, y)` function, where `x` and `y` are integers and returns `x^y`.

Do this faster than the naive method of repeated multiplication.

For example, `pow(2, 10)` should return `1024`.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-google-matching-parenthesis

[Java Solution](./src/medium-google-matching-parenthesis/java/Solution.java)
[Java Solution Idea](./src/medium-google-matching-parenthesis/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

Given a string of parentheses, write a function to compute the minimum number of parentheses to be removed to make the string valid (i.e. each open parenthesis is eventually closed).

For example, given the string "()())()", you should return 1. Given the string ")(", you should return 2, since we must remove all of them.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-microsoft-words-in-matrix

[JavaScript Solution](./src/easy-microsoft-words-in-matrix/js/solution.js)
[JavaScript Solution Idea](./src/easy-microsoft-words-in-matrix/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Microsoft**.

Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by going left-to-right, or up-to-down.

For example, given the following matrix:

```
[['F', 'A', 'C', 'I'],
 ['O', 'B', 'Q', 'P'],
 ['A', 'N', 'O', 'B'],
 ['M', 'A', 'S', 'S']]
```

and the target word **'FOAM'**, you should return **true**, since it's the leftmost column. Similarly, given the target word **'MASS'**, you should return **_true_**, since it's the last row.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-facebook-get-number-using-bit-math-operations

[Java Solution](./src/medium-facebook-get-number-using-bit-math-operations/java/Solution.java)
[Java Solution Idea](./src/medium-facebook-get-number-using-bit-math-operations/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Facebook**.

Given three 32-bit integers x, y, and b, return x if b is 1 and y if b is 0, using only mathematical or bit operations. You can assume b can only be 1 or 0.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### hard-google-king-tour

[Java Solution](./src/hard-google-king-tour/java/Solution.java)
[Java Solution Idea](./src/hard-google-king-tour/java/Idea.md)
[JavaScript Solution](./src/hard-google-king-tour/js/solution.js)
[JavaScript Solution Idea](./src/hard-google-king-tour/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

A knight's tour is a sequence of moves by a knight on a chessboard such that all squares are visited once.

Given `N`, write a function to return the number of knight's tours on an `N` by `N` chessboard.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-linkedin-correctness-of-bst

[JavaScript Solution](./src/medium-linkedin-correctness-of-bst/js/solution.js)
[JavaScript Solution Idea](./src/medium-linkedin-correctness-of-bst/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **LinkedIn**.

Determine whether a tree is a valid binary search tree.

A binary search tree is a tree with two children, left and right, and satisfies the constraint that the key in the left child must be less than or equal to the root and the key in the right child must be greater than or equal to the root.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-apple-stacks-queue

[JavaScript Solution](./src/medium-apple-stacks-queue/js/solution.js)
[JavaScript Solution Idea](./src/medium-apple-stacks-queue/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Apple**.

Implement a queue using two stacks. Recall that a queue is a FIFO (first-in, first-out) data structure with the following methods: `enqueue`, which inserts an element into the queue, and `dequeue`, which removes it.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-contextlogic-division-without-divide

[JavaScript Solution](./src/medium-contextlogic-division-without-divide/js/solution.js)
[JavaScript Solution Idea](./src/medium-contextlogic-division-without-divide/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This question was asked by **ContextLogic**.

Implement division of two positive integers without using the division, multiplication, or modulus operators. Return the quotient as an integer, ignoring the remainder.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-snapshat-overlapping-interval

[Java Solution](./src/easy-snapshat-overlapping-interval/java/Solution.java)
[Java Solution Idea](./src/easy-snapshat-overlapping-interval/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Snapchat**.

Given a list of possibly overlapping intervals, return a new list of intervals where all overlapping intervals have been merged.

The input list is not necessarily ordered in any way.

For example, given `[(1, 3), (5, 8), (4, 10), (20, 25)]`, you should return `[(1, 3), (4, 10), (20, 25)]`.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-uber-balanced-brackets

[Java Solution](./src/medium-uber-balanced-brackets/java/Solution.java)
[Java Solution Idea](./src/medium-uber-balanced-brackets/java/Idea.md)

Hi, here's your problem today. This problem was recently asked by **Uber**:

Imagine you are building a compiler. Before running any code, the compiler must check that the parentheses in the program are balanced. Every opening bracket must have a corresponding closing bracket. We can approximate this using strings.

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:

-   Open brackets are closed by the same type of brackets.
-   Open brackets are closed in the correct order.
-   Note that an empty string is also considered valid.

Example:

```
Input: "((()))"
Output: True

Input: "[()]{}"
Output: True

Input: "({[)]"
Output: False
```

```py
class Solution:
    def isValid(self, s):
        #Fill this in.
```

#### Source

Received by email from the [Daily Interview Pro](https://www.techseries.dev/daily)

### medium-google-generate_numbers_with_banned_numbers

[Java Solution](./src/medium-google-generate_numbers_with_banned_numbers/java/Solution.java)
[Java Solution Idea](./src/medium-google-generate_numbers_with_banned_numbers/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This question was asked by **Google**.

Given an integer `n` and a list of integers `l`, write a function that randomly generates a number from `0` to `n-1` that isn't in `l` (uniform).

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-google-merge-sorted-singly-list

[Java Solution](./src/medium-google-merge-sorted-singly-list/java/Solution.java)
[Java Solution Idea](./src/medium-google-merge-sorted-singly-list/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

Given k sorted singly linked lists, write a function to merge all the lists into one sorted singly linked list.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-google-deepest-node

[JavaScript Solution](./src/easy-google-deepest-node/js/solution.js)
[JavaScript Solution Idea](./src/easy-google-deepest-node/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

Given the root of a binary tree, return a deepest node. For example, in the following tree, return d.

```
    a
   / \
  b   c
 /
d
```

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-amazon-words-per-line

[JavaScript Solution](./src/medium-amazon-words-per-line/js/solution.js)
[JavaScript Solution Idea](./src/medium-amazon-words-per-line/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Amazon**.

Given a string `s` and an integer `k`, break up the string into multiple lines such that each line has a length of `k` or less. You must break it up so that words don't break across lines. Each line has to have the maximum possible amount of words. If there's no way to break the text up, then return null.

You can assume that there are no spaces at the ends of the string and that there is exactly one space between each word.

For example, given the string `"the quick brown fox jumps over the lazy dog"` and `k = 10`, you should return: `["the quick", "brown fox", "jumps over", "the lazy", "dog"]`. No string in the list has a length of more than `10`.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-google-reverse-linked-list

[Java Solution](./src/easy-google-reverse-linked-list/java/Solution.java)
[Java Solution Idea](./src/easy-google-reverse-linked-list/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

Given the head of a singly linked list, reverse it in-place.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-microsoft-read7

[Java Solution](./src/easy-microsoft-read7/java/Solution.java)
[Java Solution Idea](./src/easy-microsoft-read7/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked **Microsoft**.

Using a `read7()` method that returns `7` characters from a file, implement `readN(n)` which reads `n` characters.

For example, given a file with the content “Hello world”, three `read7()` returns “Hello w”, “orld” and then “”.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-facebook-subsetsum

[JavaScript Solution](./src/medium-facebook-subsetsum/js/solution.js)
[JavaScript Solution Idea](./src/medium-facebook-subsetsum/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Facebook**.

Given a multiset of integers, return whether it can be partitioned into two subsets whose sums are the same.

For example, given the multiset `{15, 5, 20, 10, 35, 15, 10}`, it would return `true`, since we can split it up into `{15, 5, 10, 15, 10}` and `{20, 35}`, which both add up to `55`.

Given the multiset `{15, 5, 20, 10, 35}`, it would return false, since we can't split it up into two subsets that add up to the same sum.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-microsoft-shorten-url

[JavaScript Solution](./src/easy-microsoft-shorten-url/js/solution.js)
[JavaScript Solution Idea](./src/easy-microsoft-shorten-url/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Microsoft**.

Implement a URL shortener with the following methods:

`shorten(url)`, which shortens the url into a six-character alphanumeric string, such as `zLg6wl`.
`restore(short)`, which expands the shortened string into the original url. If no such shortened string exists, return null.
Hint: What if we enter the same URL twice?

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-facebook-matrix-num-paths

[JavaScript Solution](./src/medium-facebook-matrix-num-paths/js/solution.js)
[JavaScript Solution Idea](./src/medium-facebook-matrix-num-paths/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Facebook**.

There is an `N` by `M` matrix of zeroes. Given `N` and `M`, write a function to count the number of ways of starting at the `top-left` corner and getting to the `bottom-right` corner. You can only move `right` or `down`.

For example, given a `2` by `2` matrix, you should return `2`, since there are `two ways` to get to the `bottom-right`:

-   Right, then down
-   Down, then right

Given a `5` by `5` matrix, there are `70` ways to get to the `bottom-right`.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-facebook-numbers-sum-to-k

[Java Solution](./src/easy-facebook-numbers-sum-to-k/java/Solution.java)
[Java Solution Idea](./src/easy-facebook-numbers-sum-to-k/java/Idea.md)

Hi, here's your problem today. This problem was recently asked by **Facebook**:

You are given a list of numbers, and a target number k. Return whether or not there are two numbers in the list that add up to k.

Example:
Given `[4, 7, 1 , -3, 2]` and `k = 5`,
return true since `4 + 1 = 5`.

Try to do it in a single pass of the list.

#### Source

Received by email from the [Daily Interview Pro](https://www.techseries.dev/daily)

### hard-airbnb-course-dependency

[Java Solution](./src/hard-airbnb-course-dependency/java/Solution.java)
[Java Solution Idea](./src/hard-airbnb-course-dependency/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Airbnb**.

We're given a hashmap associating each courseId key with a list of courseIds values, which represents that the prerequisites of courseId are courseIds. Return a sorted ordering of courses such that we can finish all courses.

Return null if there is no such ordering.

For example, given `{'CSC300': ['CSC100', 'CSC200'], 'CSC200': ['CSC100'], 'CSC100': []}`, should return `['CSC100', 'CSC200', 'CSCS300']`.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-amazon-espiral-matrix-print

[JavaScript Solution](./src/easy-amazon-espiral-matrix-print/js/solution.js)
[JavaScript Solution Idea](./src/easy-amazon-espiral-matrix-print/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Amazon**.

Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.

For example, given the following matrix:

```
[[1,  2,  3,  4,  5],
 [6,  7,  8,  9,  10],
 [11, 12, 13, 14, 15],
 [16, 17, 18, 19, 20]]
```

You should print out the following:

```
1
2
3
4
5
10
15
20
19
18
17
16
11
6
7
8
9
14
13
12
```

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-google-column-ordered-lexicographically

[Java Solution](./src/medium-google-column-ordered-lexicographically/java/Solution.java)
[Java Solution Idea](./src/medium-google-column-ordered-lexicographically/java/Idea.md)
[JavaScript Solution](./src/medium-google-column-ordered-lexicographically/js/solution.js)
[JavaScript Solution Idea](./src/medium-google-column-ordered-lexicographically/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

You are given an N by M 2D matrix of lowercase letters. Determine the minimum number of columns that can be removed to ensure that each row is ordered from top to bottom lexicographically. That is, the letter at each column is lexicographically later as you go down each row. It does not matter whether each row itself is ordered lexicographically.

For example, given the following table:

```
cba
daf
ghi
```

This is not ordered because of the a in the center. We can remove the second column to make it ordered:

```
ca
df
gi
```

So your function should return 1, since we only needed to remove 1 column.

As another example, given the following table:

```
abcdef
```

Your function should return 0, since the rows are already ordered (there's only one row).

As another example, given the following table:

```
zyx
wvu
tsr
```

Your function should return 3, since we would need to remove all the columns to order it.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-facebook-non-decreasing

[Java Solution](./src/medium-facebook-non-decreasing/java/Solution.java)
[Java Solution Idea](./src/medium-facebook-non-decreasing/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Facebook**.

Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element.

For example, given the array `[10, 5, 7]`, you should return `true`, since we can modify the `10` into a `1` to make the array non-decreasing.

Given the array `[10, 5, 1]`, you should return `false`, since we can't modify any one element to get a non-decreasing array.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-apple-multiplication-table

[Java Solution](./src/medium-apple-multiplication-table/java/Solution.java)
[Java Solution Idea](./src/medium-apple-multiplication-table/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Apple**.

Suppose you have a multiplication table that is N by N. That is, a 2D array where the value at the i-th row and j-th column is `(i + 1) * (j + 1)` (if 0-indexed) or `i * j` (if 1-indexed).

Given integers N and X, write a function that returns the number of times X appears as a value in an N by N multiplication table.

For example, given N = 6 and X = 12, you should return 4, since the multiplication table looks like this:

```
| 1 | 2 | 3 | 4 | 5 | 6 |

| 2 | 4 | 6 | 8 | 10 | 12 |

| 3 | 6 | 9 | 12 | 15 | 18 |

| 4 | 8 | 12 | 16 | 20 | 24 |

| 5 | 10 | 15 | 20 | 25 | 30 |

| 6 | 12 | 18 | 24 | 30 | 36 |
```

And there are 4 12's in the table.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### medium-amazon-islands

[Java Solution](./src/medium-amazon-islands/java/Solution.java)
[Java Solution Idea](./src/medium-amazon-islands/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Amazon**.

Given a matrix of 1s and 0s, return the number of "islands" in the matrix. A 1 represents land and 0 represents water, so an island is a group of 1s that are neighboring whose perimeter is surrounded by water.

For example, this matrix has 4 islands.

```
1 0 0 0 0
0 0 1 1 0
0 1 1 0 0
0 0 0 0 0
1 1 0 0 1
1 1 0 0 1
```

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-two-sigma-rand5

[Java Solution](./src/easy-two-sigma-rand5/java/Solution.java)
[Java Solution Idea](./src/easy-two-sigma-rand5/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by Two Sigma.

Using a function `rand7()` that returns an integer from `1` to `7` (inclusive) with uniform probability, implement a function `rand5()` that returns an integer from `1` to `5` (inclusive).

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-facebook-best-buy-sell-price

[JavaScript Solution](./src/easy-facebook-best-buy-sell-price/js/solution.js)
[JavaScript Solution Idea](./src/easy-facebook-best-buy-sell-price/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Facebook**.

Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.

For example, given `[9, 11, 8, 5, 7, 10]`, you should return `5`, since you could buy the stock at `5` dollars and sell it at `10` dollars.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

