package SET1;

public class PrimeCheck {

    // public static boolean isPrime(int n){
    //    if(n==2){
    //     return true;
    //    }
       
    //     boolean isPrime = true;
    //     for(int i=2; i<=n-1; i++){
    //         if(n % i ==0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }



      
     //Optimized form to check the primeOrNot
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

    public static void main(String args[]){
        System.out.println(isPrime(5));
        

    }
    
}
