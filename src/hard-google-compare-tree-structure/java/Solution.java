import java.util.Stack;

public class Solution {

    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private static boolean compareStructure(TreeNode rootS, TreeNode rootT) {

        Stack<TreeNode> stackS = new Stack<>();
        Stack<TreeNode> stackT = new Stack<>();

        stackS.push(rootS);
        stackT.push(rootT);

        while (!stackS.isEmpty() && !stackT.isEmpty()) {

            TreeNode s = stackS.pop();
            TreeNode t = stackT.pop();

            if (s == null && t != null)
                return false;
            if (t == null && s != null)
                return false;

            if (s == null && t == null)
                continue;

            if (s.val != t.val)
                return false;

            stackS.push(s.left);
            stackS.push(s.right);

            stackT.push(t.left);
            stackT.push(t.right);

        }

        return stackS.isEmpty() && stackT.isEmpty();
    }

    private static boolean hasSameStructure(TreeNode rootS, TreeNode rootT) {
        if (rootS == null)
            return false;
        if (hasSameStructure(rootS.right, rootT))
            return true;
        if (hasSameStructure(rootS.left, rootT))
            return true;

        return compareStructure(rootS, rootT);
    }

    public static void main(String[] args) {
        TreeNode s1 = new TreeNode(1);
        s1.left = new TreeNode(2);

        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);

        System.out.println(hasSameStructure(s1, t1)); // true

        TreeNode s2 = new TreeNode(1);
        s2.left = new TreeNode(2);
        s2.right = new TreeNode(2);
        s2.right.right = new TreeNode(2);
        s2.right.left = new TreeNode(2);

        TreeNode t2 = new TreeNode(2);
        t2.right = new TreeNode(2);
        t2.left = new TreeNode(2);

        System.out.println(hasSameStructure(s2, t2)); // true
    }

}