package while_Loop;
 // The Question is - Count the number of bits to be flipped to convert a number to another number
import java.util.Scanner;


// This program takes two integers as input and counts the number of bits that need to be flipped in order to convert one integer into another.

public class FlipConvertNum {
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
 
		int n1 = 0;
		int n2 = 0;
 
		int cnt = 0;
		int lsb1 = 0;
		int lsb2 = 0;
 
		System.out.printf("Enter the Number 1 : ");
		n1 = sc.nextInt();
 
		System.out.printf("Enter the Number 2 : ");
		n2 = sc.nextInt();
 
		while ((n1 > 0) || (n2 > 0))
		{
			lsb1 = n1 & 1;
			lsb2 = n2 & 1;
 
			if (lsb1 != lsb2)
				cnt++;
 
			n1 = n1 >> 1;
			n2 = n2 >> 1;
		}
		System.out.println("Number of bits flipped : "+ cnt);
	}
}


// Outputs u can try !!!
// Enter the Number 1 : 10
// Enter the Number 2 : 50
// Number of bits flipped : 3
