package Do_while_Loop;

import java.util.Scanner;

public class EvenNum {
public static void main(String args[])
    {
        System.out.println("Enter The Limit : ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        do {
            System.out.println(i);
            i=i+2;
        }while (i<=n);
    }
}
