class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Helper class to store result
class Res {
    public int val;
}

class Solution {
    Node root;

    // Utility function to find maximum path sum
    int findMaxUtil(Node node, Res res) {
        if (node == null)
            return 0;

        // Recursive calls for left and right subtrees
        int l = findMaxUtil(node.left, res);
        int r = findMaxUtil(node.right, res);

        // Max path for parent call of root. Node data + either left or right
        int max_single = Math.max(Math.max(l, r) + node.data, node.data);

        // Max Top represents the sum when the node is the root of the max path
        int max_top = Math.max(max_single, l + r + node.data);

        // Update the overall result
        res.val = Math.max(res.val, max_top);

        return max_single;
    }

    // Function to return maximum path sum
    int findMaxSum() {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        findMaxUtil(root, res);
        return res.val;
    }

    // Driver code
    public static void main(String args[]) {
        Solution tree = new Solution();

        // Constructing the tree
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);

        System.out.println("Maximum path sum is : " + tree.findMaxSum());
    }
}
