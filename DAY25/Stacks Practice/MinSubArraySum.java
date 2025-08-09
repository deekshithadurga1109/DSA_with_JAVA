
import java.util.*;

public class MinSubArraySum  {
    static final int MOD = 1_000_000_007;

    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long result = 0;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        // PLE: strictly smaller
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // NLE: smaller or equal
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // Contribution sum
        for (int i = 0; i < n; i++) {
            long contrib = ((long) arr[i] * left[i] * right[i]) % MOD;
            result = (result + contrib) % MOD;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumSubarrayMins(arr));
    }
}