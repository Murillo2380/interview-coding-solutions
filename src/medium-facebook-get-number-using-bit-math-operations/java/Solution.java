public class Solution {

    static int solve(int x, int y, int b) {

        int opositeB = (b + 1) & 1;
        x *= b;
        y *= opositeB;

        return x + y;

    }

    public static void main(String[] args) {

        int x = 10;
        int y = 25;

        System.out.println(solve(x, y, 1)); // 10
        System.out.println(solve(x, y, 0)); // 25

    }

}