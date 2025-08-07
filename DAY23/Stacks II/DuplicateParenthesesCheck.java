import java.util.Stack;

public class DuplicateParenthesesCheck {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Closing bracket
            if (ch == ')') {
                int count = 0;

                // Count elements inside the current pair of parentheses
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                // Pop the opening bracket
                s.pop();

                // If less than 1 element inside '()', it's a duplicate
                if (count < 1) {
                    return true;
                }
            } else {
                // Push any other character (including opening bracket)
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String args[]) {
        // Valid string
        String str1 = "((a+b))";  // true (duplicate)
        System.out.println(isDuplicate(str1));

        // Invalid string
        String str2 = "(a+b)";    // false (no duplicate)
        System.out.println(isDuplicate(str2));
    }
}