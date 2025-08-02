import java.util.*;

public class ArrayListQueryHandler {
    
    public static ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) {
        ArrayList<Integer> result = new ArrayList<>();

        if (Q == 1) {
            int p = Query.get(0); // index
            int r = Query.get(1); // value to insert
            A.add(p, r); // insert r at index p
            return A; // return updated list
        } else if (Q == 2) {
            // Search last occurrence
            int p = Query.get(0); 
            int lastIndex = -1;

            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) == p) {
                    lastIndex = i;
                }
            }

            result.add(lastIndex);
            return result;
        }

        return result; // default return
    }


    public static void main(String[] args) {
        // Example 1
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(1, 4, 5, 9, 3));
        ArrayList<Integer> Query1 = new ArrayList<>(Arrays.asList(2, 6));
        System.out.println(solve(5, A1, 1, Query1)); // Output: [1, 4, 6, 5, 9, 3]

        // Example 2
        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(1, 9, 2, 4));
        ArrayList<Integer> Query2 = new ArrayList<>(Arrays.asList(4));
        System.out.println(solve(4, A2, 2, Query2)); // Output: [3]
    }
}
