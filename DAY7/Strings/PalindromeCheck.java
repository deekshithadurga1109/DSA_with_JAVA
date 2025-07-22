import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }

        return true; // All matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
    }
}

