
package while_Loop;
import java.util.*;

public class PrintNaturalNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Starting Number : ");
            int start = sc.nextInt();
        System.out.print("Enter The Ending Number : ");
            int end = sc.nextInt();
            while(start<=end) {
                System.out.print(start + " ");
                start++;
            }
    }
}


// Printing them in reverse 

// public class PrintInReverse {
// 	public static void main(String[] args)
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter The Starting Number : ");
// 		int s =sc.nextInt();
// 		System.out.print("Enter The Ending Number : ");
// 		int e =sc.nextInt(); 
// 		while(s>=e)
// 		{
// 			System.out.println(s);
// 			s--;
// 		}
// 	}
// }


