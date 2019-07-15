import java.util.Stack;

public class Solution {

    public static boolean isBalanced(String s) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            int current = s.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
                continue;
            }

            if (stack.isEmpty())
                return false;

            int top = stack.pop();

            switch (top) {
            case '(':
                if (current != ')')
                    return false;
                break;
            case '{':
                if (current != '}')
                    return false;

                break;

            default:
                if (current != ']')
                    return false;
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("((()))"));
        System.out.println(isBalanced("[()]{}"));
        System.out.println(isBalanced("({[)]"));
    }
}