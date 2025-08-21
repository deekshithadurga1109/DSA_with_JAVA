import java.util.HashMap;

public class Solution4 {
    static HashMap<String, Integer> m;

    // Tree node structure
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Function to serialize subtrees (inorder) and detect duplicates
    static String inorder(Node node) {
        if (node == null)
            return "";

        String str = "(";
        str += inorder(node.left);
        str += Integer.toString(node.data);
        str += inorder(node.right);
        str += ")";

        // If this subtree already appeared once, print its root
        if (m.get(str) != null && m.get(str) == 1)
            System.out.print(node.data + " ");

        // Store / update count of this subtree
        m.put(str, m.getOrDefault(str, 0) + 1);

        return str;
    }

    // Function to print all duplicate subtree roots
    static void printAllDups(Node root) {
        m = new HashMap<>();
        inorder(root);
    }

    // Driver code
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        root.right.right = new Node(4);

        System.out.print("Duplicate subtree roots: ");
        printAllDups(root);
    }
}
