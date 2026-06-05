public class BinaryTree {

    // Node class
    static class Node {
        int data; // data of node
        Node left; // left child of node
        Node right; // right child of node

        // Constructor
        Node(int value) { // constructor of node
            data = value; // Initialize data with the given value
            left = null; // Initialize left child to null
            right = null; // Initialize right child to null
        }
    }

    public static void main(String[] args) {

        // Create root node
        Node root = new Node(10); // Create the root node with data value 10

        // Create left and right children
        root.left = new Node(20); // Create the left child of the root node with data value 20
        root.right = new Node(30); // Create the right child of the root node with data value 30

        // Create children of left node
        root.left.left = new Node(40); // Create the left child of the left node with data value 40
        root.left.right = new Node(50); // Create the right child of the left node with data value 50

        System.out.println("Root Node: " + root.data); // Print the data of the root node
    }
}

   //     10
   //    /  \
   //  20    30
   // /  \
   // 40   50