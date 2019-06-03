# Idea behind the solution

In this problem it is demanded to allow **n** elements in the cache, having to remove the least used when the cache is full

It was created a list to make some kind of "history", where the **tail** has the least used and the **head** has the recently used.
When an element is reused (by reading or updating its value) it is needed to remove the element from the middle of the list and put as the **head**. If an array were used, it would be needed to remove the element from the middle of the list and iterate over it to pull the elements, so there is no 'blank' spaces in the array. To avoid it, a doubly linked list is used so in **O(1)** we can quickly remove any node from the list re-insert it.

To know every node from the linked list, a hashmap (maps the given **key** to the **node**) is used, so in **O(1)** time we can access any node.

The garbage collector will free any leaked memory, no need to directly manage it.
