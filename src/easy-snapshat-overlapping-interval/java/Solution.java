import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static class Interval {
        private int i;
        private int j;

        Interval(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        public boolean isEnveloping(Interval interval) {
            return getI() <= interval.getI() && getJ() >= interval.getJ();
        }

        @Override
        public String toString() {
            return "(" + getI() + ", " + getJ() + ")";
        }

    }

    // O(n^2)
    private static void solve(Interval[] intervals) {

        ArrayList<Interval> solution = new ArrayList<>(intervals.length);
        boolean isBeingOverlapped;

        for (int i = 0; i < intervals.length; i++) {
            isBeingOverlapped = false;
            for (int j = 0; j < intervals.length; j++) {
                if (i == j)
                    continue;

                if (intervals[j].isEnveloping(intervals[i])) {
                    isBeingOverlapped = true;
                    break;
                }
            }

            if (!isBeingOverlapped)
                solution.add(intervals[i]);
        }

        System.out.println(solution);
    }

    // O(n logn)
    private static void solve2(Interval[] intervals) {
        Arrays.sort(intervals, (a, b) -> a.getI() - b.getI());

        System.out.println(intervals[0]);
        Interval lastPrinted = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (lastPrinted.isEnveloping(intervals[i]))
                continue;
            System.out.println(intervals[i]);
            lastPrinted = intervals[i];
        }
    }

    public static void main(String[] args) {
        ArrayList<Interval> test = new ArrayList<>();
        test.add(new Interval(1, 3));
        test.add(new Interval(5, 8));
        test.add(new Interval(4, 10));
        test.add(new Interval(20, 25));

        solve(test.toArray(new Interval[test.size()]));
        System.out.println("---");
        solve2(test.toArray(new Interval[test.size()]));
        System.out.println("Test 2");
        ArrayList<Interval> test2 = new ArrayList<>();
        test2.add(new Interval(6, 8));
        test2.add(new Interval(1, 9));
        test2.add(new Interval(2, 4));
        test2.add(new Interval(4, 7));

        // (1,9)
        solve(test2.toArray(new Interval[test2.size()]));
        System.out.println("---");
        solve2(test2.toArray(new Interval[test2.size()]));
    }

}
