import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

    public static LinkedList<Integer> merge(ArrayList<LinkedList<Integer>> linkedLists) {

        LinkedList<Integer> solution = new LinkedList<>();

        while (true) {

            LinkedList<Integer> smaller = null;

            for (int i = 0; i < linkedLists.size(); i++) {
                if (linkedLists.get(i).isEmpty())
                    continue;

                if (smaller == null || smaller.getFirst() > linkedLists.get(i).getFirst())
                    smaller = linkedLists.get(i);
            }

            if (smaller == null)
                break;

            solution.addLast(smaller.removeFirst());

        }

        return solution;

    }

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(15);
        list2.add(25);
        list2.add(35);
        list2.add(45);
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(2);
        list3.add(6);
        list3.add(11);
        list3.add(24);
        list3.add(28);
        list3.add(80);
        list3.add(90);
        ArrayList<LinkedList<Integer>> lists = new ArrayList<>(3);
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        System.out.println(merge(lists));
    }

}