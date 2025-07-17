package For_Lopp;

import java.util.Scanner;

public class NumPalindromecheck {
    public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Digits :");
		int num = sc.nextInt();
		int rev = 0, rem, temp;
		temp = num;
		while (num != 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		};
 
		if (temp == rev)
			System.out.println (temp + " is Palindrome");
		else
			System.out.println (temp + " is not Palindrome");
	}
}
