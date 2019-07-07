# Idea behind the solution

In this problem, b will be either 0 or 1. If we multiply x \* b, we will have:

```
x * b = x if b = 1
x * b = 0 if b = 0
```

Similary for y:

```
y * b = y if b = 1
y * b = 0 if b = 0
```

We need something that allows us to have:

```
x * f(b) = x if b = 1
y * f'(b) = 0 if b = 1
```

And:

```
x * f(b) = 0 if b = 0
y * f'(b) = y if b = 0
```

If we have this, we can just return `x + y` or `x | y` since one of them will always be 0.

From the following equation:

```
x * f(b) = x if b = 1
x * f(b) = 0 if b = 0
```

Clearly `f(b) = b`. From the following equation:

```
y * f'(b) = 0 if b = 1
y * f'(b) = y if b = 0
```

We need to, somehow, "invert" the result from `f(b)` (we need `f'(b`) to be the opposite of `f(b)`). We can use a simple bit manipulator to achieve this.

Considering the possibles binary values of `b`:

```
b = 0 -> ...0000 0000
b = 1 -> ...0000 0001
```

If we sum 1 to b, we get:

```
b = 1 -> ...0000 0001
b = 2 -> ...0000 0010
```

Note that, for `b = 2`, there is an extra 1 we want to get rid of, If we use the [and bitwase](http://www.tutorialspoint.com/java/java_basic_operators.htm) operator, we can get rid of it:

```
1 & 1 = 1
...0000 0001
...0000 0001
------------
...0000 0001

2 & 1 = 0
...0000 0010
...0000 0001
------------
...0000 0000
```

Therefore, to get `1` when `b = 0` and `0` when `b = 1`:

```
f'(b) = (f(b) + 1) & 1
```

The final formula will be:

```java
b2 = (b + 1) & 1
x2 = x * b
y2 = y * b2
result = x2 + y2 // or x2 | y2
```
