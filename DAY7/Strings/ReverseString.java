public class ReverseString {
    public static void reverse(char[] s) {
        int left = 0;
        int right = s.length - 1;

        // Swap characters from both ends toward the center
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'J', 'A', 'V', 'A'};
        reverse(s1);
        System.out.println(java.util.Arrays.toString(s1)); // Output: [o, l, l, e, h]

        char[] s2 = {'D','S','A'};
        reverse(s2);
        System.out.println(java.util.Arrays.toString(s2)); // Output: [h, a, n, n, a, H]
    }
}
