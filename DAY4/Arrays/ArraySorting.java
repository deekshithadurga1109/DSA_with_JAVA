import java.util.Scanner;
import java.util.Arrays;
public class ArraySorting{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i =0; i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(int arrSort :arr ){
      System.out.print(arrSort + " ");
    }
    
  }
}