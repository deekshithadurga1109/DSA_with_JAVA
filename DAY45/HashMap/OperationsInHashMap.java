import java.util.*;
public class OperationsInHashMap {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert Elemnets into HM  --> O(1)
        hm.put("india", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);


        //Get --> O(1)

        int population = hm.get("india");
        System.out.println(population);

        System.out.println(hm.get("indonesia")); // returns null : key is not exist in the MAP

        //ContainsKeys --> O(1)

        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("indonesia"));

        //remove --> O(1)
        System.out.println(hm.remove("india"));
        System.out.println(hm);


    }
    
}
