import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class QueuesByJCF {

        public static void main(String args[]) {
//  QueueA q = new QueueA();
//   Queue<Integer> q = new LinkedList<>();
Queue<Integer> q = new ArrayDeque<>();  // ArrayDeque
 q.add(1);
 q.add(2);
 q.add(3);


  // 1 2 3 
 while (!q.isEmpty()) {
    System.out.println(q.peek());
    q.remove();
    
 }

    }
}
