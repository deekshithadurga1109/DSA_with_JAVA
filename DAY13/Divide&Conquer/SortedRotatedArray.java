public class SortedRotatedArray {
    public static int search(int arr[] , int tar, int si, int ei) {
        // task 
        int mid = si + (ei - si) / 2;

        //case found 
        if(arr[mid] == tar) {
            return mid;
        }

        //mid on l1
        if(arr[si] <= arr[mid]) {
            // Case a : left 
            if(arr[si] <= tar && tar<= arr[mid]) {
                return search(arr, tar, si, mid-1);
            } else {
                // case - b : right 
                return search(arr, tar, mid+1, ei);
            }
        }

        //mid on l2 
        else {
            // case c : right 
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            } else {
                // case d : left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; // output --> 4
        int taridx = search(arr, target, 0, arr.length-1);
        System.out.println(taridx);
    }
}
