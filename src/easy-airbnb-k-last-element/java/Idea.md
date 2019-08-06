# Idea behind the solution

We just need to iterate throught the whole list. We need to remove the k-th last element, therefore, after iterating k times we can set the `nodeToRemove` as being the head of the list. If we are not in the end of the list, we can then set `nodeToRemove = nodeToRemove.next`, in other words, we just need to remember the element that is `k` positions behind from the current element in the iteration.

Considering we don't have access to the previous element, we need to keep tracking the element that is `k+1` elements behind also, so we can unlink the `k` element.

The code runs in `O(n)` (once per each element in the list) and needs `O(1)` space.
