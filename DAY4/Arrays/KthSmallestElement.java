public class KthSmallestElement {

    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr[k - 1];  
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        System.out.println(kthSmallest(arr1, k1));  

        int[] arr2 = {2, 3, 1, 20, 15};
        int k2 = 4;
        System.out.println(kthSmallest(arr2, k2));  
    }
}
