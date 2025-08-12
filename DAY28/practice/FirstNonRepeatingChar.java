package practice;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        char result = '-';
        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                result = ch;
                break;
            }
        }

        System.out.println(result);
    }
}
