import java.util.Scanner;

public class TargetSum {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    
    for(int i=0; i<N; i++){
      arr[i]= sc.nextInt();
    }
    int target = sc.nextInt();
    int left = 0;
    int right = N-1;
    boolean found = false;
    while(left < right){
      int sum = arr[left] + arr[right];
      if(sum == target){
        System.out.println(arr[left] + " "+arr[right]);
        found = true;
        break;
      } else if (sum <target){
        left++;
      }else{
        right++;
      }
    }
    if(!found){
      System.out.print("-1");
    }
    
    
  }
}