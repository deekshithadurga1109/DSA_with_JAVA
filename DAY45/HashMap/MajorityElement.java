import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        // Step 1: Create a HashMap to count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // Using getOrDefault to simplify counting
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Check which elements appear more than n/3 times
        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}