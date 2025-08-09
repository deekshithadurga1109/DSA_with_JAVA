import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);

        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;

        boolean condition = isPalindrome(one);
        System.out.println("Palindrome : " + condition);
    }

    static boolean isPalindrome(Node head) {
        Node slow = head;
        Stack<Integer> stack = new Stack<>();

        // Push all elements to the stack
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.ptr;
        }

        // Compare while popping from stack
        while (head != null) {
            int i = stack.pop();
            if (head.data != i) {
                return false;
            }
            head = head.ptr;
        }

        return true;
    }
}

class Node {
    int data;
    Node ptr;
    Node(int d) {
        ptr = null;
        data = d;
    }
}