
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SubtreeOfAnothertree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int ln = height(root.left);
        int rh = height(root.right);
        return Math.max(ln, rh)+ 1;
    }

    public static int count(Node root) {
        if(root == null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static int sum(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }
  // Diameter function to find Diameter of the Treee 
    public static int diameter2(Node root) {  //O(N^2)
        if(root == null) {
            return 0;
        }
        int leftDiam = diameter2(root.left);
        int rightDiam = diameter2(root.right);
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDiam,rightDiam));

    }

    static class Info {
        int diam;
        int ht;
        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) { // O(N)
        if(root ==null) {
            return new Info(0,0);
        }
        Info leInfo = diameter(root.left);
        Info righInfo = diameter(root.right);

        int diam = Math.max(Math.max(leInfo.diam,righInfo.diam), leInfo.ht + righInfo.ht + 1);
        int ht = Math.max(leInfo.ht, righInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if(node == null && subRoot == null){
            return true;
        } else if(node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if(root == null) {
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }



       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); 

    }
    public static void main(String[] args) {
        /*
               1
              / \
             2   3
            / \ / \
           4  5 6  7

         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);


        /*
                 2
                / \ 
               4   5     

         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        // subRoot.right = new Node(5); // false check 


        System.out.println(isSubtree(root, subRoot));
    }
    
}
