import java.util.*;
public class Frequent1 {
    public int mostFrequent(ArrayList<Integer> nums, int key) {
    int[] result = new int[1000]; // assuming nums[i] in 1..1000

    for (int i = 0; i < nums.size() - 1; i++) {
        if (nums.get(i) == key) {
            result[nums.get(i + 1) - 1]++;
        }
    }

    int max = Integer.MIN_VALUE;
    int ans = 0;

    for (int i = 0; i < 1000; i++) {
        if (result[i] > max) {
            max = result[i];
            ans = i + 1; // reverse -1 indexing done above
        }
    }

    return ans;
}

}