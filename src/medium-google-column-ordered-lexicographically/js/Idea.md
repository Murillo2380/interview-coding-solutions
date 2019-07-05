# Idea behind the solution

The problem states that the letters in the column must be sorted, not the column and the row itself. Therefore The solution boils down to go through each column and check which column is not sorted lexicographically. When the column is not sorted, we count it because we would have to remove it.

The running time of this algorithm is O(n\*m) because we pass once for each character in the matrix.
