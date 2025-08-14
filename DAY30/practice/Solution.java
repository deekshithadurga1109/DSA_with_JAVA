package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    static void generatePrintBinary(int n) {
        Queue<String> q = new LinkedList<>();

        // Start with "1"
        q.add("1");

        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();

            System.out.println(s1);

            q.add(s1 + "0");  // Append '0'
            q.add(s1 + "1");  // Append '1'
        }
    }

    public static void main(String[] args) {
        int n = 10;
        generatePrintBinary(n);
    }
}
