import java.util.HashMap;
import java.util.Map;

public class Solution {

    static int rand7() {
        return (int) (Math.random() * 6d + 1d);
    }

    static int rand5() {

        int number;
        do {
            number = rand7();
        } while (number > 5);

        return number;
    }

    static void printKeyMap(int key, int value) {
        System.out.println(key + ":" + value);
    }

    public static void main(String[] args) {

        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < 500; i++) {
            final int num = rand5();
            final int current = count.getOrDefault(num, 0);
            count.put(num, current + 1);
        }

        count.forEach(Solution::printKeyMap); // On average each will have a count of more or less 100
    }

}
