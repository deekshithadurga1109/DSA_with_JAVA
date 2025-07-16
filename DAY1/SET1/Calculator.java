// The question we have 
// Write a program to create a simple calculator using switch statements.If the given operator is not found print ‘-1’.

// using +,-,*,/,% operators only


package SET1;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator = scanner.next().charAt(0);
        int n1 = scanner.nextInt(); 
        int n2 = scanner.nextInt(); 
        scanner.close();

        switch (operator) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                if (n2 != 0)
                    System.out.println(n1 / n2);
                else
                    System.out.println("Division by zero error");
                break;
            case '%':
                if (n2 != 0)
                    System.out.println(n1 % n2);
                else
                    System.out.println("Modulo by zero error");
                break;
            default:
                System.out.println("-1");
        }
    }
}
