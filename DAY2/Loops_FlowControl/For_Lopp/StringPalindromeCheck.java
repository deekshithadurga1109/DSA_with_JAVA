package For_Lopp;

import java.util.Scanner;

public class StringPalindromeCheck {
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The String :");
		String str = sc.nextLine();
		String rev = "";
		int len = str.length();
		for (int i = (len - 1); i >=0; --i)
		{
			rev = rev + str.charAt(i);
		}
		if (str.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println(str + " is a Palindrome String.");
		}
		else
		{
			System.out.println(str + " is not a Palindrome String.");
		}
	}
}
