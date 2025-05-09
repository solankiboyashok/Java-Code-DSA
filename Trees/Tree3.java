

package Trees;
import java.util.Scanner;

public class Tree3 {
static class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}


    public static boolean isSymmetric(Node root){
        return helper(root.left, root.right);
    }

    public static boolean helper(Node p, Node q){
        if(p == null && q != null || p != null && q == null){
            return false;
        }
        if(p == null && q == null){
            return true;
        }
        if(p.data != q.data){
            return false;
        }
        return helper(p.left, q.right) && helper(p.right, q.left);
    }

    // Method to insert nodes in the binary tree
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        Node root = null;

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the values of the nodes:");
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            root = insert(root, val);
        }

        System.out.println("Is the tree symmetric? " + isSymmetric(root));
    }
}
