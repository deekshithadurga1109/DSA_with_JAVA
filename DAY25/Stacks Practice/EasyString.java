import java.util.*;

public class EasyString {

    public static String encodeString(String s) {
        if (s == null || s.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        char[] chars = s.toLowerCase().toCharArray(); // make lowercase for counting

        int count = 1;
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                result.append(count).append(chars[i - 1]);
                count = 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(encodeString(input));
        }

        sc.close();
    }
}
