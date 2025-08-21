class Solution {
    static class Node {
        int data;
        Node left, right;
    }

    // Create a new node
    static Node newNode(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    // Function to delete leaf nodes with value x
    static Node deleteLeaves(Node root, int x) {
        if (root == null)
            return null;

        // Recurse for left and right subtrees
        root.left = deleteLeaves(root.left, x);
        root.right = deleteLeaves(root.right, x);

        // If root is a leaf and has value x, delete it
        if (root.data == x && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }

    // Inorder traversal
    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Driver code
    public static void main(String[] args) {
        Node root = newNode(10);
        root.left = newNode(3);
        root.right = newNode(10);
        root.left.left = newNode(3);
        root.left.right = newNode(1);
        root.right.right = newNode(3);
        root.right.right.left = newNode(3);
        root.right.right.right = newNode(3);

        int x = 3; // value to delete

        System.out.print("Inorder traversal before deletion: ");
        inorder(root);
        System.out.println();

        root = deleteLeaves(root, x);

        System.out.print("Inorder traversal after deletion: ");
        inorder(root);
    }
}
