import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Solution {

    public static class NumberGenerator {

        private class Interval {
            int start;
            int end;

            Interval(int start, int end) {
                this.start = start;
                this.end = end;
            }

            @Override
            public String toString() {
                return "(" + start + "," + end + ")";
            }
        }

        private ArrayList<Interval> intervals;
        private ArrayList<Double> intervalProbabilities;

        public NumberGenerator(int max, int[] bannedNumbers) {
            Arrays.sort(bannedNumbers);
            intervals = new ArrayList<>(bannedNumbers.length);
            generateIntervals(max, bannedNumbers);
            generateCumulativeProbabilities(max, bannedNumbers);
        }

        private void generateIntervals(int max, int[] bannedNumbers) {

            intervals.add(new Interval(0, bannedNumbers[0] - 1));

            int currentIndex = 1;
            while (currentIndex < bannedNumbers.length) {

                Interval lastInterval = null;
                int end = bannedNumbers[currentIndex] - 1;

                lastInterval = intervals.get(intervals.size() - 1);
                this.intervals.add(new Interval(lastInterval.end + 2, end));
                currentIndex++;

            }

            Interval lastInterval = intervals.get(intervals.size() - 1);
            intervals.add(new Interval(lastInterval.end + 2, max));

        }

        private void generateCumulativeProbabilities(int max, int[] bannedNumbers) {
            intervalProbabilities = new ArrayList<>();
            int domainLength = max - bannedNumbers.length + 1;

            for (Interval i : intervals) {
                int numNumbers = i.end - i.start + 1;
                double previousProbability = intervalProbabilities.isEmpty() ? 0d
                        : intervalProbabilities.get(intervalProbabilities.size() - 1);

                intervalProbabilities.add(previousProbability + numNumbers / (double) domainLength);
            }
        }

        private int searchFirstGreater(double probability) {
            int start = 0;
            int end = intervalProbabilities.size() - 1;

            while (start <= end) {
                int center = (start + end) / 2;
                if (intervalProbabilities.get(center) > probability)
                    end = center - 1;
                else
                    start = center + 1;

            }

            return Math.max(start, end);
        }

        public int random() {
            double probability = Math.random();

            Interval choosenInterval = intervals.get(searchFirstGreater(probability));

            int numNumbers = choosenInterval.end - choosenInterval.start + 1;
            return choosenInterval.start + (int) (Math.random() * numNumbers);
        }

    }

    public static void main(String[] args) {
        int[] bannedNumbers = { 2, 6, 8 };
        int max = 10;
        NumberGenerator generator = new NumberGenerator(max - 1, bannedNumbers);
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < 80000; i++) {
            int random = generator.random();
            int count = countMap.getOrDefault(random, 0);
            countMap.put(random, count + 1);
        }

        System.out.println(countMap.entrySet()); // More or less the same count
    }

}