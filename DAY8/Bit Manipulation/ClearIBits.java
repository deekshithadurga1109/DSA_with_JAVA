public class ClearIBits {
    public static int clearIBits(int n , int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }


    public static void main(String args[]){
        System.out.println(clearIBits(15, 2)); // 12 we get 
    }
}
