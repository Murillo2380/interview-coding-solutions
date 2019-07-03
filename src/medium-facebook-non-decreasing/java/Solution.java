import java.util.stream.IntStream;

public class Solution {

    public static boolean solve(int[] n) {

        int foundProblemAt = -1;

        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] < n[i + 1])
                continue;

            if (foundProblemAt != -1)
                return false;

            foundProblemAt = i;
        }

        if (foundProblemAt == -1 || foundProblemAt == 0)
            return true;

        return n[foundProblemAt + 1] - n[foundProblemAt - 1] > 1;

    }

    public static void main(String[] args) {
        // 1,2,3,8,10 true
        // 1,2,9,8,10 true
        // 10,5,7 true
        // 10,5,1 false
        // 1,11,9,8,10 false
        // 11,2,3,8,10 true
        // 1,2,3,3,10 false

        int[][] tests = { { 1, 2, 3, 8, 10 }, { 1, 2, 9, 8, 10 }, { 10, 5, 7 }, { 10, 5, 1 }, { 1, 11, 9, 8, 10 },
                { 11, 2, 3, 8, 10 }, { 1, 2, 3, 3, 10 } };

        for (int[] test : tests)
            System.out.println(solve(test));
    }
}