import org.w3c.dom.Node;

public class LinkedListPart2 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // property
    public static Node tail; // property
    public static int size;

    // Floyd's cycle finding Algorithm 
     public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(fast == slow){
                return true; // cycle exist
            }
            
        }
         return false; // cycle doesn`t exit
    }

    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }
        //find meaning point
        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }
        // merge sort 
    


    private Node getMid(Node head) {
        Node slow  = head;
        Node fast = head.next;

        while(fast != null && head.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow; // mid node
    }


    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }



    public Node mergeSort(Node head) {
        if(head == null && head.next != null) {
            return head;
        }
        // find mid
    Node mid = getMid(head);
        //left & right MS 
     Node rightHead = mid.next;
     mid.next = null;
     Node newLeft = mergeSort(head);
     Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());
        removeCycle();
    }

}
