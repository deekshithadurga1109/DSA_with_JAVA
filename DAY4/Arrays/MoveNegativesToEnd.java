public class MoveNegativesToEnd {

    public static void rearrange(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -1, 3, 2, -7, -5, 11, 6};
        rearrange(arr1);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr2 = {-5, 7, -3, -4, 9, 10, -1, 11};
        rearrange(arr2);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
