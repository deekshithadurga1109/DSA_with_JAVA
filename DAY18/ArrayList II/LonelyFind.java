import java.util.ArrayList;
import java.util.Collections;

public class  LonelyFind {

    public ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
    Collections.sort(nums); // Sort the list to check consecutive differences
    ArrayList<Integer> list = new ArrayList<>();

    // Check middle elements
    for (int i = 1; i < nums.size() - 1; i++) {
        if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
            list.add(nums.get(i));
        }
    }

    // Check edge cases
    if (nums.size() == 1) {
        list.add(nums.get(0));
    }

    if (nums.size() > 1) {
        // First element
        if (nums.get(0) + 1 < nums.get(1)) {
            list.add(nums.get(0));
        }
        // Last element
        if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
            list.add(nums.get(nums.size() - 1));
        }
    }

    return list;
}


}
