public class Queue {
    static class QueueA {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        QueueA(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+ 1) % size == front;
        }

        //add 
        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is full");
                return;
            }
            // add 1st  element
            if(front == -1){
                front =0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove 
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int result = arr[front];
            front = (front+1) % size;

            //last elemet delete condition

            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front+1) % size;
            }
             return result;
            // int front = arr[0];
            // for(int i=0; i<rear; i++) {
            //     arr[i] = arr[i+1];
            // }
            // rear = rear -1;
            // return front;
        }

        //peek 
        public static int peek() {
             if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]) {
 QueueA q = new QueueA(3);
 q.add(1);
 q.add(2);
 q.add(3);

 System.out.println(q.remove());
 q.add(4);
 System.out.println(q.remove());
 q.add(5);
  // 1 2 3 
 while (!q.isEmpty()) {
    System.out.println(q.peek());
    q.remove();
    
 }

    }
}