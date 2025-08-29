import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;  // lengths must be equal for an anagram
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters of string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Subtract counts using string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (map.get(ch) == null) {
                return false; // character not found in s
            }

            if (map.get(ch) == 1) {
                map.remove(ch); // remove if count becomes 0
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }

        return map.isEmpty(); // all counts should be zero
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        System.out.println(isAnagram(s, t));
    }
}