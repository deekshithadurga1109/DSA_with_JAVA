public class HalfPyramid {

    public static void half_pyaramid(int n) {
    for(int i= 1; i<=n; i++){
        //spaces 
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        // stars 
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
            System.out.println();
            }


    }
    

    public static void main(String args[]){
     half_pyaramid(10);
    }
}
