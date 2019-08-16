import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {

    private static final byte NOT_CALCULATED = 0;
    private static final byte HAS_SUM = 1;
    private static final byte NOT_HAS_SUM = 2;

    private static boolean hasSubsetSum(int[] multiset, int n, int sum, byte[][] cache) {

        if (sum == 0)
            return true;

        if (sum < 0 || n == 0)
            return false;

        if (cache[n][sum] != NOT_CALCULATED)
            return cache[n][sum] == HAS_SUM;

        boolean result = hasSubsetSum(multiset, n - 1, sum, cache)
                || hasSubsetSum(multiset, n - 1, sum - multiset[n - 1], cache);

        cache[n][sum] = result ? HAS_SUM : NOT_HAS_SUM;
        return cache[n][sum] == HAS_SUM;

    }

    private static boolean canBeDivided(int[] multiset) {
        int sum = Arrays.stream(multiset).sum();
        if (sum % 2 != 0)
            return false;

        byte[][] cache = new byte[multiset.length + 1][sum / 2 + 1];

        return hasSubsetSum(multiset, multiset.length, sum / 2, cache);
    }

    public static void main(String[] args) {
        int[] multiset = { 15, 5, 20, 10, 35, 15, 10 };
        System.out.println(canBeDivided(multiset)); // true

        int[] multiset2 = { 1, 1, 1, 1, 10 };
        System.out.println(canBeDivided(multiset2)); // false
    }

}