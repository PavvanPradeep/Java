package Java.DataStructures;
import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BSTree {
    
    private TreeNode root;
    public BSTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } 
        else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void inOrder() {
        System.out.print("In-order Traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void preOrder() {
        System.out.print("Pre-order Traversal: ");
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder() {
        System.out.print("Post-order Traversal: ");
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(TreeNode root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BSTree bst = new BSTree();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the BST: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            bst.insert(element);
        }

        bst.inOrder();
        bst.preOrder();
        bst.postOrder();

        scanner.close();
    }
}
