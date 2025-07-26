public class SumOfNatural {


    public static int calcSum(int n){
         if(n==1) {
            return 1;
         }

         int snm1 = calcSum(n-1);
         int sn = n + snm1;
         return sn;

        }
            
    public static void main(String args[]){
  int n =5;
    System.out.println(calcSum(n));
    }
}
