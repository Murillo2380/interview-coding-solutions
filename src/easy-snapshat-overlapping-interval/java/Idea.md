# Idea behind the solution

Here we simply compare each interval with every other interval, comparing if an interval is being overlapped or not. For each interval we test against every other interval, thus this algorithm runs in `O(n^2)`.

Another solution is to sort the intervals from its starting number, then, if the ending interval of `interval[i]` is lesser than `interval[k]`, where `k` is the last printed interval (starting by `0`), than it is being overlapped by `interval[k]`, therefore, ignore it in the output.

The running time of this last approach is `O(n lg(n))`. The n lg(n) for sorting + n operations for printing.
