import java.util.*;
public class practice {

    public static void update(int marks[], int num){
        num = 20;
        for(int i=0; i<marks.length; i++){
            marks[i] =marks[i] + 1;

        }
        System.out.println(num);
    }
    public static void main(String args[]) {
      int marks[] = { 99, 98, 90};
      int num = 80;
      update(marks, num);
  System.out.println(num);

      // print our marks :
      for(int i=0; i<marks.length; i++){
        System.out.print(marks[i] + " ");
      }
      System.out.println();
    }
}
