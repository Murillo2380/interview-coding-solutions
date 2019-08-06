public class Solution {

    private static class MyNode {
        MyNode next;
        int val;

        MyNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            MyNode current = this;

            StringBuilder sb = new StringBuilder();

            while (current != null) {
                sb.append(current.val).append(",");
                current = current.next;
            }

            return sb.toString();
        }
    }

    private static MyNode remove(MyNode head, int k) {
        if (head == null)
            return null;
        if (k < 0)
            return null;

        MyNode current = head;
        MyNode nodeToRemove = null;
        MyNode previousOfNodeToRemove = null;
        int offset = 0;

        while (current != null) {

            if (offset == k)
                nodeToRemove = head;

            else if (offset > k)
                nodeToRemove = nodeToRemove.next;

            if (offset == k + 1)
                previousOfNodeToRemove = head;

            else if (offset > k + 1)
                previousOfNodeToRemove = previousOfNodeToRemove.next;

            current = current.next;
            offset++;

        }

        if (previousOfNodeToRemove == null && nodeToRemove == null)
            return head;

        if (previousOfNodeToRemove == null)
            return head.next;

        previousOfNodeToRemove.next = nodeToRemove.next;
        return head;

    }

    public static void main(String[] args) {

        MyNode head = new MyNode(1);
        head.next = new MyNode(2);
        head.next.next = new MyNode(3);
        head.next.next.next = new MyNode(4);
        head.next.next.next.next = new MyNode(5);

        System.out.println(head);
        head = remove(head, 2);
        System.out.println(head);

    }

}