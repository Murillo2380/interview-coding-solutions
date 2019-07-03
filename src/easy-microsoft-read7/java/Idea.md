# Idea behind the solution

The solution for this problem is simple, we just need to read 7 letters as much as possible. As long as `total_letters_read + 7 < total_needed` we keep reading with `read7()`. At the end, we read another 7 letters and throw away the end of the string we don't need (in case we read more than asked).
