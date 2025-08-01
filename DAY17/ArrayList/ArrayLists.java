import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
   // add element 
        list.add(1); // )  O(1)
        list.add(2);
        list.add(3);
        System.out.println(list);

        //Get element operation
      int ele =  list.get(2); //O(1)
      System.out.println(ele);

      //Delete

      list.remove(2);
      System.out.println(list);

      //Set element 

      list.set(1,100); // O(n)
      System.out.println(list);


      //contains 
      System.out.println(list.contains(1));
      System.out.println(list.contains(11));



        
        
    }
}