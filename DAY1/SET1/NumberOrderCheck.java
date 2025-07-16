//Question we have 
//Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and otherwise print  "-1".
// Input Format:
// First line , first number num-1
// Second line , second number num-2
// Third line , third number num-3
// Output Format:
// Print Increasing or Decreasing


package SET1;
import java.util.Scanner;

public class NumberOrderCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("-1");
        }
    }
}


