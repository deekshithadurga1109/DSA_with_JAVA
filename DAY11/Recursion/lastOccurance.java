public class lastOccurance {
    public static int lastOcc(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
    public static void main(String args[]){
 int arr[] = { 8, 9, 8, 5, 2,1, 5, 0};
 System.out.println(lastOcc(arr, 5, 0));
    }
}
