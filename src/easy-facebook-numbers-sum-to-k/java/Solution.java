import java.util.HashSet;
import java.util.Arrays;

public class Solution {

    public static boolean exists(int[] numbers, int k) {

        HashSet<Integer> set = new HashSet<>();

        return Arrays.stream(numbers).anyMatch(number -> {
            set.add(number);
            return set.contains(k - number);
        });

    }

    public static void main(String[] args) {
        System.out.println(exists(new int[] { 4, 7, 1, -3, 2 }, 5)); // true
        System.out.println(exists(new int[] { 4, 7, 1, -3, 2 }, 6)); // true
        System.out.println(exists(new int[] { 4, 7, 1, -3, 2 }, 7)); // false
        System.out.println(exists(new int[] { 4, 7, 1, -3, 2 }, -1)); // true
    }
}