import java.util.Arrays;

public class Solution {

    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    private static void shiftLeft(int[] list, int count) {
        for (int i = 0; i < list.length - count; i++) {
            swap(list, i, count + i);
        }
    }

    private static void shiftRight(int[] list, int count) {
        for (int i = list.length - 1; i >= count; i--) {
            swap(list, i, i - count);
        }
    }

    private static void rotate(int[] list, int k) {

        k %= list.length;

        if (k <= 0)
            return;

        if (k <= list.length / 2)
            shiftLeft(list, k);
        else
            shiftRight(list, list.length - k);

    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            int[] list = { 1, 2, 3, 4, 5, 6 };
            rotate(list, i);
            System.out.println(Arrays.toString(list));
        }
    }

}