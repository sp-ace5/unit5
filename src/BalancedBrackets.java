import java.util.Stack;

public class BalancedBrackets {

    public static boolean balancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (isBracket(c)) {
                if (!stack.isEmpty() && areMatchingBrackets(stack.peek(), c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isBracket(char c) {
        return "(){}[]<>".contains(String.valueOf(c));
    }

    private static boolean areMatchingBrackets(char open, char close) {
        String brackets = "(){}[]<>";
        return brackets.indexOf(open) == brackets.indexOf(close) - 1;
    }

    public static void main(String[] args) {
    }
}