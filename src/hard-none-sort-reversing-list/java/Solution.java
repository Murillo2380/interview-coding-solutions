import java.util.Arrays;
import java.util.List;

public class Solution {

    private static void reverse(List<Integer> list, int i, int j) {
        while (i < j) {
            int temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);
            i++;
            j--;
        }
    }

    private static int smallerFrom(List<Integer> list, int i) {
        int lesser = i;
        while (i < list.size()) {
            if (list.get(lesser) > list.get(i)) {
                lesser = i;
            }
            i++;
        }
        return lesser;
    }

    private static void sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int smallerIndex = smallerFrom(list, i);
            reverse(list, i, smallerIndex);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 0, 6, 10, 50, -20, 30);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

}