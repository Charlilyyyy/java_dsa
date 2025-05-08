package Trees;
// import Trees.TreeNode;
import java.util.Scanner;

public class BinaryTreee {
    TreeNode root;

    void printLeftToRightTree(TreeNode node){
        if (node == null) return;
        printLeftToRightTree(node.left);
        System.out.println(node.data);
        printLeftToRightTree(node.right);
    }

    void printRightToLeftTree(TreeNode node){
        if (node == null) return;
        printRightToLeftTree(node.right);
        System.out.println(node.data);
        printRightToLeftTree(node.left);
    }

    void printFromMiddleToLeftRight(TreeNode node){
        if (node == null) return;
        System.out.println(node.data);
        printFromMiddleToLeftRight(node.left);
        printFromMiddleToLeftRight(node.right);
    }

    void printFromMiddleToRightLeft(TreeNode node){
        if (node == null) return;
        System.out.println(node.data);
        printFromMiddleToRightLeft(node.right);
        printFromMiddleToRightLeft(node.left);
    }

    void insert(int data){
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data){
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        // BinaryTreee firstTree = new BinaryTreee();
        // firstTree.root = new TreeNode(1);
        // firstTree.root.right = new TreeNode(20);
        // firstTree.root.right.right = new TreeNode(21);
        // firstTree.root.right.left = new TreeNode(22);
        // firstTree.root.left = new TreeNode(41);
        // firstTree.root.left.left = new TreeNode(42);
        // firstTree.root.left.right = new TreeNode(43);
        // firstTree.printLeftToRightTree(firstTree.root);
        // System.out.println("\n");
        // firstTree.printRightToLeftTree(firstTree.root);
        // System.out.println("\n");
        // firstTree.printFromMiddleToLeftRight(firstTree.root);
        // System.out.println("\n");
        // firstTree.printFromMiddleToRightLeft(firstTree.root);
        // System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        BinaryTreee tree = new BinaryTreee();

        System.out.print("Enter number of nodes to insert: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " node values:");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            tree.insert(val);
        }

        System.out.println("\nLeft-to-Right Tree Traversal:");
        tree.printLeftToRightTree(tree.root);

        // Call your other traversal methods if needed
        scanner.close();
    }
}