public class GridWays {

    // Recursive function to count paths in a grid
    public static int gridWays(int i, int j, int n, int m) {
        // Base case: reached the last cell
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // Boundary condition: out of grid
        else if (i == n || j == m) {
            return 0;
        }

        // Move down
        int w1 = gridWays(i + 1, j, n, m);
        // Move right
        int w2 = gridWays(i, j + 1, n, m);

        // Total ways = ways going down + ways going right
        return w1 + w2;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}