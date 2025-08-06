import java.util.*;
public class StackReverse {
    public static void  pushBtm(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBtm(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBtm(s, top);

    }

    public static void printStack(Stack<Integer>  s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // printStack(s);
    // 3, 2, 1
        reverseStack(s);
        printStack(s);
        // 1, 2, 3


    }
}
