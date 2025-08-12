package practice;

import java.util.*;

public class PalindromeCheckUsingDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        Deque<Character> deque = new ArrayDeque<>();

        // Add all characters to deque
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // Compare front and back until empty or mismatch
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("palindrome!");
        } else {
            System.out.println("not a palindrome");
        }
    }
}

