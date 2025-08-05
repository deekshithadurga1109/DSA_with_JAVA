
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}


public class ReveseLL {
    //Approach 1  --> Using Iterative Method 
   // TC - O(n)  // SC O(1)
       static Node reverseList(Node head) {
        
        Node curr = head, prev = null, next;

        while (curr != null) {
            
            next = curr.next;
            
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        
        return prev;
    }


    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        } 

    }
    //Approach 2 --> Using Recursion method
    

    //Pproach 3 --> Using Stack Method


    public static void main(String[] args) {


        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked list:");
        printList(head);
        
        head = reverseList(head);

        System.out.print("\nReversed Linked List:");
        printList(head);
    }
}
