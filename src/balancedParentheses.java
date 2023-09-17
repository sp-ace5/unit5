import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class balancedParentheses {

    public static boolean findParentheses(String ex) {
        int count = 0;

        for (char x : ex.toCharArray()) {
            if (x == '(') {
                count++;
            } else if (x == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

    public static boolean findBrackets(String ex) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('{', '}');
        bracketPairs.put('[', ']');
        bracketPairs.put('<', '>');

        for (char c : ex.toCharArray()) {
            if (bracketPairs.containsKey(c)) {
                stack.push(c);
            } else if (bracketPairs.containsValue(c)) {
                if (stack.isEmpty() || bracketPairs.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "(()))(";
        String test3 = "{[()]}";
        String test4 = "{[(])}";
        System.out.println(findParentheses(test1));
        System.out.println(findParentheses(test2));
        System.out.println(findBrackets(test3));
        System.out.println(findBrackets(test4));


    }
}

