import java.util.ArrayList;
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

    public static void main(String[] args) {
        ArrayList<Interval> test = new ArrayList<>();
        test.add(new Interval(1, 3));
        test.add(new Interval(5, 8));
        test.add(new Interval(4, 10));
        test.add(new Interval(20, 25));

        solve(test.toArray(new Interval[test.size()]));
    }

}
