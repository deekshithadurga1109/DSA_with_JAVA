public class OddEvenCheck {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0 ){
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }

    }

    public static void main(String args[]) {
        oddOrEven(3);
        oddOrEven(4);


    }
    
}
