//The Question we have 
//Given an integer,n , perform the following conditional actions:If n is odd, print WeirdIf n is even and in the inclusive range of 2 to 5 , print Not WeirdIf n is even and in the inclusive range of 6 to 20 , print WeirdIf n is even and greater than 20 , print Not Weird


package SET1;
import java.util.*;

public class WeirdOrNot {
    public static void main(String[] args){
        int n = new Scanner(System.in).nextInt();

        if ((n % 2 != 0) || (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

    }
}
