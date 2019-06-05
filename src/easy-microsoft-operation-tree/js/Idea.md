# Idea behind the solution

First and foremost, assumptions has been made: the input will always be either a number or one of the basic math operations and each node of the tree will have either 2 or none childrens.

This problem can be done recursively. In the recursive function we just need to check if we have a leaf (no left and right children). If that is the case, assume we have a number and return it, otherwise, just update the current node's val by calling the same function for both left and right children.

Carefull with the call stack limit, which may not allow to run this code for a deep tree. This code may be improved by coding an iterative version.
