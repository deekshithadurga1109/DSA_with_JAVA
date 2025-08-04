public class LinkedList {
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

     //add first

    public void addFirst(int data) {

        //step-1 : creat  new node 
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
   return;
        }
    
        //step2 - newNode next = head
        newNode.next = head; // link

        //step -3 head = newNode
        head = newNode;
    }


    // add last 

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next  = newNode;
    }
   
    //print LinkedList

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    
    public void add(int idx , int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1; tempp --> prev 
        newNode.next = temp.next;
        temp .next = newNode;

    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println(" LL is empty ");
            return Integer.MIN_VALUE;
        } else if( size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove Last 

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // pre : i = size-2
        Node prev = head ;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

  // Search (Iterative)

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) { // key found
                return i;
            }temp = temp.next;
            i++;

        }
        return -1; // key notFound case 
    }


    

    public static void main(String args[]) {
        LinkedList ll = new LinkedList(); //obj
        ll.print();
        ll.addFirst(2);
         ll.print();
        ll.addFirst(1);
         ll.print();
        ll.addLast(3);
         ll.print();
       ll.addLast(4);
        ll.print();


        ll.add(2, 9);
        ll.print(); // 1 -> 2 -> 9 -> 3 -> 4 
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);


        System.out.println(ll.itrSearch(9));
        System.out.println(ll.itrSearch(10));

      



        
        }
}