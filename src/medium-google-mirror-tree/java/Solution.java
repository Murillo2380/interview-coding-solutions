import java.util.Stack;

public class Solution {

    public static class BinaryTree {

        public static class Node {
            private Node left;
            private Node right;
            private String val;

            public Node(String val) {
                this.val = val;
            }

            public void setRight(String val) {
                setRight(new Node(val));
            }

            public void setLeft(String val) {
                setLeft(new Node(val));
            }

            public void setLeft(Node node) {
                left = node;
            }

            public void setRight(Node node) {
                right = node;
            }

            public Node getLeft() {
                return left;
            }

            public Node getRight() {
                return right;
            }

            public String getVal() {
                return val;
            }
        }

        private Node root;

        public void setRoot(String val) {
            this.root = new Node(val);
        }

        public Node getRoot() {
            return root;
        }

        private String printNode(Node node, int level) {
            if (node == null)
                return "";
            StringBuilder sb = new StringBuilder();
            String format = "%" + (level * 4 + 4) + "s%n";
            String s = String.format(format, node.getVal());
            sb.append(s);
            sb.append(printNode(node.getLeft(), level + 1));
            sb.append(printNode(node.getRight(), level + 1));
            return sb.toString();
        }

        @Override
        public String toString() {
            if (root == null)
                return "[Empty tree]";
            return printNode(root, 0);
        }

    }

    private static void swapChildren(BinaryTree.Node node) {
        BinaryTree.Node left = node.left;
        BinaryTree.Node right = node.right;
        node.setLeft(right);
        node.setRight(left);
    }

    private static void mirrorBinaryTree(BinaryTree binaryTree) {

        Stack<BinaryTree.Node> stack = new Stack<>();
        stack.push(binaryTree.getRoot());

        while (!stack.isEmpty()) {
            BinaryTree.Node current = stack.pop();
            if (current == null)
                continue;
            swapChildren(current);
            stack.add(current.getLeft());
            stack.add(current.getRight());
        }

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.setRoot("a");
        BinaryTree.Node root = tree.getRoot();
        root.setLeft("b");
        root.setRight("c");
        root.getLeft().setLeft("d");
        root.getLeft().setRight("e");
        root.getRight().setLeft("f");
        System.out.println(tree);
        mirrorBinaryTree(tree);
        System.out.println("Mirrored tree");
        System.out.println(tree);
    }

}