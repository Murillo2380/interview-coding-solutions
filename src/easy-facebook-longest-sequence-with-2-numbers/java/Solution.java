import java.util.Arrays;

public class Solution {

    private static void incrementIfEquals(int i, int[] array, int[] repeatedCount) {

        if (i == 0 || array[i] != array[i - 1]) {
            repeatedCount[i] = 1;
            return;
        }

        repeatedCount[i] = repeatedCount[i - 1] + 1;

    }

    private static int countSequence(int startIndex, int[] array, int[] repeatedCount) {

        int i = startIndex;
        Integer firstNumber = null;
        Integer secondNumber = null;

        while (i < array.length) {
            if (firstNumber == null) {
                firstNumber = array[i];
                incrementIfEquals(i++, array, repeatedCount);
                continue;
            }
            if (secondNumber == null) {
                secondNumber = array[i];
                incrementIfEquals(i++, array, repeatedCount);
                continue;
            }
            if (array[i] != firstNumber && array[i] != secondNumber)
                return i;

            i++;
        }

        return i;

    }

    public static int solve(int[] array) {

        int currentIndex = 0;
        int maxLength = 0;
        int[] repeatedNumberCount = new int[array.length];

        while (currentIndex < array.length - 1) {
            int stopIndex = countSequence(currentIndex, array, repeatedNumberCount);
            maxLength = Math.max(maxLength, stopIndex - currentIndex + repeatedNumberCount[currentIndex] - 1);
            currentIndex = stopIndex - 1;
        }

        return maxLength;

    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 3, 1, 3, 1, 5 };
        int[] array2 = { 1, 3, 5, 5, 5, 5, 5, 5, 3, 1, 3, 1, 5 };
        int[] array3 = { 1, 3, 3, 5, 5, 5, 5, 5, 5, 3, 1, 3, 1, 5 };
        int[] array4 = { 1, 1, 2, 2 };
        System.out.println(solve(array)); // 4
        System.out.println(solve(array2)); // 8
        System.out.println(solve(array3)); // 9
        System.out.println(solve(array4)); // 4
    }

}