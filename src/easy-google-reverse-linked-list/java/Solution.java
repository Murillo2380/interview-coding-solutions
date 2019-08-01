import java.util.*;

class Solution {

    static class MyLinkedList {

        private Node head = null;

        private class Node {
            private Node next = null;
            private int value;

            Node(int value) {
                this.value = value;
            }

            public void setNext(Node next) {
                this.next = next;
            }

            public Node getNext() {
                return next;
            }
        }

        public MyLinkedList add(int value) {
            Node node = new Node(value);
            return add(node);
        }

        public MyLinkedList add(Node node) {
            if (head == null) {
                setHead(node);
                return this;
            }

            Node current = head;
            while (current.next != null)
                current = current.getNext();

            current.setNext(node);

            return this;
        }

        public void setHead(Node head) {
            this.head = head;
        }

        public Node getHead() {
            return head;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            Node current = head;
            while (current.next != null) {
                sb.append(current.value).append(",");
                current = current.getNext();
            }

            return sb.append(current.value).toString();
        }

    }

    private static void reverse(MyLinkedList list) {

        MyLinkedList.Node previous = null;
        MyLinkedList.Node current = list.getHead();

        while(current != null){
            MyLinkedList.Node remainingList = current.getNext();
            current.setNext(previous);
            previous = current;
            current = remainingList;
        }

        list.setHead(previous);
        
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1).add(2).add(3).add(4).add(5);
        System.out.println(list);
        reverse(list);
        System.out.println(list);

    }
}