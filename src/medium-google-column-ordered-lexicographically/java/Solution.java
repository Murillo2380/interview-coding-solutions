import java.util.stream.IntStream;

public class Solution {

    public static boolean isColumnSorted(int column, char[][] matrix) {
        return IntStream.range(1, matrix.length).allMatch(i -> matrix[i][column] > (matrix[i - 1][column]));
    }

    public static long solve(char[][] matrix) {
        return IntStream.range(0, matrix[0].length).filter(column -> !isColumnSorted(column, matrix)).count();
    }

    public static void main(String[] args) {
        char[][] matrix1 = { { 'c', 'b', 'a' }, { 'd', 'a', 'f' }, { 'g', 'h', 'i' }, };
        char[][] matrix2 = { { 'a', 'b', 'c', 'd' } };
        char[][] matrix3 = { { 'z', 'y', 'x' }, { 'w', 'v', 'u' }, { 't', 's', 'r' }, };
        System.out.println(solve(matrix1)); // 1
        System.out.println(solve(matrix2)); // 0
        System.out.println(solve(matrix3)); // 3
        ;
    }

}