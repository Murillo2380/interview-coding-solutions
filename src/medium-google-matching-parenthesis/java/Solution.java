import java.util.Stack;

public class Solution {

    public static long solve(String s) {

        Stack<Integer> openingParenthesis = new Stack<>();

        long missingOpeningParenthesis = s.chars().filter(c -> {
            if (c == ')' && openingParenthesis.isEmpty())
                return true;

            if (c == '(')
                openingParenthesis.push(c);
            else
                openingParenthesis.pop();

            return false;
        }).count();

        return missingOpeningParenthesis + openingParenthesis.size();
    }

    public static void main(String[] args) {
        System.out.println(solve("((()))")); // 0
        System.out.println(solve("()()()")); // 0
        System.out.println(solve("()())()")); // 1
        System.out.println(solve("()()))()")); // 2
        System.out.println(solve("()()))(())(")); // 3
        System.out.println(solve(")(")); // 2
    }
}