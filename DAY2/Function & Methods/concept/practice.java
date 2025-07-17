package concept;

public class practice {
    
  
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }


        for(int i=2; i<Math.sqrt(n); i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }


    public static void primesInRange(int n){
        for(int i =2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }




public static void binToDec(int binNum){
    int myNumb = binNum;
    int pow =0;
    int decNum = 0;

    while(binNum >0){
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit *(int) Math.pow(2, pow));

        pow++;
        binNum = binNum / 10;
    }
    System.out.println("decimal of " + myNumb +" =" + decNum);

}

     public static void decToBin(int n){
     int myNum = n;
        int pow =0;
        int binNum = 0;

        while(n>0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n=n/2;
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }



    public static void main(String args[]){
        binToDec(101);
        

    } 
}
