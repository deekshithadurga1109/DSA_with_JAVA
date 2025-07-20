public class ArraysCC {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;

                // Calculate subarray sum
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }

                // Print current subarray (optional)
                // System.out.println("Subarray (" + start + "," + end + ") sum: " + currSum);

                // Update maxSum if needed
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum subarray sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, -3, 4, -1, -2, 1, 5, -3};
        maxSubarraySum(numbers);  // Output: 7
    }
}
