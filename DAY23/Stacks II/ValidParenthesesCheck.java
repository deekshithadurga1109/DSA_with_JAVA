import java.util.Stack;

public class ValidParenthesesCheck {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } 
            // Closing brackets
            else {
                if (s.isEmpty()) {
                    return false;
                }

                if ((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '{' && ch == '}') ||
                    (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String args[]) {
        String str = "({[]})";  // Example input
        System.out.println(isValid(str)); // Output: true
    }
}