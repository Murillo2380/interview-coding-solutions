# Description

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

# Source

Received by email from the [Daily Interview Pro](https://www.techseries.dev/daily)
