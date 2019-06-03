# Idea behind the solution

The problem does not state any restriction or performance bounds.

It was simply used to stacks, one to stack any enqueued value and the other to be used as a helper, so we transfer every items from one stack to the other, remove the last element from the helper stack and than transfer the elements back to the first stack to maintain the enqueued order.
