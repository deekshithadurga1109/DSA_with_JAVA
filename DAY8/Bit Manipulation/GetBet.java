public class GetBet {
    public static int getIthBit(int n, int i){
      int bitmask = 1 <<i;
      if((n & bitmask ) == 0) {
        return 0;
      }else {
        return 1;
      }
    }
    public static void main(String args[]){
// 10 --> 1010 
 // i=2  -->  ans = 0
// if i = 1 --> ans = 1

        System.out.println(getIthBit(10, 2));

    }
}
