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

### easy-amazon-espiral-matrix-print

[JavaScript Solution](src/easy-amazon-espiral-matrix-print/js/solution.js)

[JavaScript Solution idea](src/easy-amazon-espiral-matrix-print/js/Idea.md)

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

### easy-facebook-best-buy-sell-price

[JavaScript Solution](src/easy-facebook-best-buy-sell-price/js/solution.js)

[JavaScript Solution idea](src/easy-facebook-best-buy-sell-price/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Facebook**.

Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.

For example, given `[9, 11, 8, 5, 7, 10]`, you should return `5`, since you could buy the stock at `5` dollars and sell it at `10` dollars.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-facebook-best-multiply-in-array

[JavaScript Solution](src/easy-facebook-best-multiply-in-array/js/solution.js)

[JavaScript Solution idea](src/easy-facebook-best-multiply-in-array/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Facebook**.

Given a list of integers, return the largest product that can be made by multiplying any three integers.

For example, if the list is `[-10, -10, 5, 2]`, we should return `500`, since that's `-10 * -10 * 5`.

You can assume the list has at least three integers.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-google-deepest-node

[JavaScript Solution](src/easy-google-deepest-node/js/solution.js)

[JavaScript Solution idea](src/easy-google-deepest-node/js/Idea.md)

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

### easy-google-reverse-linked-list

[Java Solution](src/easy-google-reverse-linked-list/java/Solution.java)

[Java Solution idea](src/easy-google-reverse-linked-list/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

Given the head of a singly linked list, reverse it in-place.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-microsoft-digits-sum-10

[JavaScript Solution](src/easy-microsoft-digits-sum-10/js/solution.js)

[JavaScript Solution idea](src/easy-microsoft-digits-sum-10/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Microsoft**.

A number is considered perfect if its digits sum up to exactly `10`.

Given a positive integer `n`, return the `n-th` perfect number.

For example, given `1`, you should return `19`. Given `2`, you should return `28`.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-microsoft-operation-tree

[JavaScript Solution](src/easy-microsoft-operation-tree/js/solution.js)

[JavaScript Solution idea](src/easy-microsoft-operation-tree/js/Idea.md)

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

### easy-microsoft-read7

[Java Solution](src/easy-microsoft-read7/java/Solution.java)

[Java Solution idea](src/easy-microsoft-read7/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked **Microsoft**.

Using a `read7()` method that returns `7` characters from a file, implement `readN(n)` which reads `n` characters.

For example, given a file with the content “Hello world”, three `read7()` returns “Hello w”, “orld” and then “”.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-microsoft-shorten-url

[JavaScript Solution](src/easy-microsoft-shorten-url/js/solution.js)

[JavaScript Solution idea](src/easy-microsoft-shorten-url/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Microsoft**.

Implement a URL shortener with the following methods:

`shorten(url)`, which shortens the url into a six-character alphanumeric string, such as `zLg6wl`.
`restore(short)`, which expands the shortened string into the original url. If no such shortened string exists, return null.
Hint: What if we enter the same URL twice?

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-microsoft-words-in-matrix

[JavaScript Solution](src/easy-microsoft-words-in-matrix/js/solution.js)

[JavaScript Solution idea](src/easy-microsoft-words-in-matrix/js/Idea.md)

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

### easy-snapshat-overlapping-interval

[Java Solution](src/easy-snapshat-overlapping-interval/java/Solution.java)

[Java Solution idea](src/easy-snapshat-overlapping-interval/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Snapchat**.

Given a list of possibly overlapping intervals, return a new list of intervals where all overlapping intervals have been merged.

The input list is not necessarily ordered in any way.

For example, given `[(1, 3), (5, 8), (4, 10), (20, 25)]`, you should return `[(1, 3), (4, 10), (20, 25)]`.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### easy-two-sigma-rand5

[Java Solution](src/easy-two-sigma-rand5/java/Solution.java)

[Java Solution idea](src/easy-two-sigma-rand5/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by Two Sigma.

Using a function `rand7()` that returns an integer from `1` to `7` (inclusive) with uniform probability, implement a function `rand5()` that returns an integer from `1` to `5` (inclusive).

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### hard-airbnb-course-dependency

[Java Solution](src/hard-airbnb-course-dependency/java/Solution.java)

[Java Solution idea](src/hard-airbnb-course-dependency/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Airbnb**.

We're given a hashmap associating each courseId key with a list of courseIds values, which represents that the prerequisites of courseId are courseIds. Return a sorted ordering of courses such that we can finish all courses.

Return null if there is no such ordering.

For example, given `{'CSC300': ['CSC100', 'CSC200'], 'CSC200': ['CSC100'], 'CSC100': []}`, should return `['CSC100', 'CSC200', 'CSCS300']`.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### hard-google-king-tour

[Java Solution](src/hard-google-king-tour/java/Solution.java)

[Java Solution idea](src/hard-google-king-tour/java/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

A knight's tour is a sequence of moves by a knight on a chessboard such that all squares are visited once.

Given `N`, write a function to return the number of knight's tours on an `N` by `N` chessboard.

#### Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)

### hard-google-least-recently-used-cache

[JavaScript Solution](src/hard-google-least-recently-used-cache/js/solution.js)

[JavaScript Solution idea](src/hard-google-least-recently-used-cache/js/Idea.md)

Good morning! Here's your coding interview problem for today.

This problem was asked by **Google**.

Implement an LRU (Least Recently Used) cache. It should be able to be initialized with a cache size n, and contain the following methods:

-   `set(key, value)`: sets key to value. If there are already n items in the cache and we are adding a new item, then it should also remove the least recently used item.
-   `get(key)`: gets the value at key. If no such key exists, return null.

Each operation should run in `O(1)` time.

# Source

Received by email from the [Daily Coding Problem](https://www.dailycodingproblem.com)
