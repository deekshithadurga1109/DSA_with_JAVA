public class PowerOfTwoCheck {
    public static boolean isPoerOfTwo(int n) {
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
  System.out.println(isPoerOfTwo(15));
    }
}
