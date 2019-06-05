# Idea behind the solution

A [Bijection function](https://en.wikipedia.org/wiki/Bijection) is being asked, which means it can map one value to another without "duplicated mappings" (2 different values mapping to the same value).

Although a simple hash function could be used, it is hard to determinate the odds of having a really big url to map to the same short url, it is easier to store the big url in a cache/database and generate an ID for it, and than transform this ID to the shorten url, so with the shorten url we transform back to the ID and get the real ID from the DB.

Basically it is needed to transform a base 10 number into a base 62 number (every letter, capital letter and numbers = 62 in total).

Read more about his approach [here](https://stackoverflow.com/questions/742013/how-do-i-create-a-url-shortener).
