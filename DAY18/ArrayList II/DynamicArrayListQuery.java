import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayListQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of lines
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Reading the n lines
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // number of integers on this line
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                innerList.add(sc.nextInt());
            }
            list.add(innerList);
        }

        int q = sc.nextInt(); // Number of queries

        // Processing queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // line number
            int y = sc.nextInt(); // position

            // Check boundaries before accessing
            if (x <= list.size() && y <= list.get(x - 1).size()) {
                System.out.println(list.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
