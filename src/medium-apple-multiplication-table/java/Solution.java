import java.util.*;

class Solution {

    private static List<Integer> divisors(int n, int maxDivisor) {

        final int min = Math.min(n / 2, maxDivisor);
        List<Integer> divisors = new ArrayList<>(min);

        for (int i = 2; i <= min; i++)
            if (n % i == 0)
                divisors.add((i));

        return divisors;
    }

    private static int solve(int n, int x) {

        int count = 0;
        List<Integer> divisors = divisors(x, n);
        System.out.println(divisors);
        boolean foundAny = true;
        for (int i = divisors.size() - 1; foundAny && i >= 0; i--) {
            foundAny = false;
            for (int j = i; j >= 0; j--) {
                if (divisors.get(i) * divisors.get(j) != x) {
                    continue;
                }

                foundAny = true;

                if (i == j)
                    count++;
                else
                    count += 2;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve(6, 12)); // 4
        System.out.println(solve(6, 9)); // 1
        System.out.println(solve(6, 36)); // 1
        System.out.println(solve(6, 20)); // 2
        System.out.println(solve(6, 30)); // 2
    }
}