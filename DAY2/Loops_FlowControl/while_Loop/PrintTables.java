package while_Loop;

import java.util.Scanner;

public class PrintTables {
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Starting Number : ");
		int s = sc.nextInt();
		System.out.print("Enter The Ending Number : ");
		int e =sc.nextInt();
		System.out.print("Enter The Tables Number : ");
		int n =sc.nextInt(); 
		while(s<=e)
		{
			System.out.println(s+" * "+n+" = "+(s*n));
			s++;
		}


        // To print the table in reverse
        // while(s>=e)
        //         {
        //             System.out.println(s+" * "+n+" = "+(s*n));
        //             s--;
        //         }


	}
}
