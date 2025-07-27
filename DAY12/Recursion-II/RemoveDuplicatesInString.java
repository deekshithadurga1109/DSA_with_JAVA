public class RemoveDuplicatesInString {
    // Function to remove duplicates using recursion
public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
    // base case
    if(idx == str.length()) {
        System.out.println(newStr);
        return;
    }

    // kaam
    char currChar = str.charAt(idx);
    if(map[currChar - 'a'] == true) {
        // duplicate
        removeDuplicates(str, idx + 1, newStr, map);
    } else {
        map[currChar - 'a'] = true;
        removeDuplicates(str, idx + 1, newStr.append(currChar), map);
    }
}

// main method
public static void main(String args[]) {
    String str = "apnacollege";
    removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
}
}
