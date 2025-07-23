public class SetBit {

    public static int setBit(int n ,int i) {
       int bitMask = 1<<i;
       return n | bitMask;
    }
   public static void main(String args[]){
    System.out.println(setBit(10, 2));  //14

   } 
}
