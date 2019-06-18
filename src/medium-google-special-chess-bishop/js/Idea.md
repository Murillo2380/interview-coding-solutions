# Idea behind the solution

For 2 bishops to be attacking each other they must be in their diagonal. If you pay attention to the diagonal movement, you need to go both 1 step down and 1 step right (if going to bottom-right). You always need to go the same numbers of step down and then right. Therefore, the difference between rows must be the same the difference between columns that are being compared.

Therefore we need to compare one bishop to all the others doing the above calculation. Note that, after comparing bishops 1 and 2 we don't need to compare bishops 2 and 1 again.
