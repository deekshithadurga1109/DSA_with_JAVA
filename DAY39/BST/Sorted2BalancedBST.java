public class Sorted2BalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node( int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }

        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static Node createBST(int arr[], int st, int end) {
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left
    }

    public static void main(String[] args) {
        
        int arr[] = {3, 5, 6, 8, 10, 11, 12};

        /*
            8
          /   \
         5    11
        / \   / \
       3   6 10  12

       expected BST
         */
    }
}
