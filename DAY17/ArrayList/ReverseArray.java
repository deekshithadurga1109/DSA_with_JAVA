import java.util.ArrayList;

public class ReverseArray {
    public static void main(String arg[]){
         ArrayList<Integer> list = new ArrayList<>();
         list.add(1); // )  O(1)
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);

        for(int i=list.size() -1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
