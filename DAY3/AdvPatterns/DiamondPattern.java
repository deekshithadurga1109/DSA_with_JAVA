public class DiamondPattern {
    public static void diamond(int n){
        // ist half
        for(int i=1; i<=n; i++){
            //spaces 
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        // 2nd half 

                // ist half
        for(int i=n; i>=i; i--){
            //spaces 
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        diamond(6);
    }
}
