import java.util.ArrayList;

public class Frequent2 {
    public ArrayList<Integer> beautifulArray(int n) {
    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(1); // base beautiful array for n = 1

    for (int i = 2; i <= n; i++) {
        ArrayList<Integer> temp = new ArrayList<>();

        // First add even numbers
        for (Integer e : ans) {
            if (2 * e <= n)
                temp.add(2 * e);
        }

        // Then add odd numbers
        for (Integer e : ans) {
            if (2 * e - 1 <= n)
                temp.add(2 * e - 1);
        }

        ans = temp;
    }

    return ans;
}

}
