package Trees;
// inorder, postorder ,preorder travelling 
import java.util.Scanner;
class tree1{
static class Node{
   int data;
   Node left;
   Node right;
   Node(int data){
      this.data=data;
      this.left=this.right=null;
   }
}

   public static void preorder(Node root){
      if(root==null){
         return;
      }
      System.out.print(root.data+" ");
      preorder(root.left);
      preorder(root.right);
   }
   public static void inorder(Node root){
      if(root==null){
         return;
      }
      inorder(root.left);
      System.out.print(root.data+" ");
      inorder(root.right);
   }
   public static void postorder(Node root){
      if(root==null){
         return;
      }
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data+" ");
   }
   public static Node insertNode(Node root, int key) {
      if (root == null) {
          root = new Node(key);
          return root;
      }
      if (key < root.data)
          root.left = insertNode(root.left, key);
      else if (key > root.data)
          root.right = insertNode(root.right, key);
      return root;
  }
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
  
   Node root = null;

   System.out.println("Enter the number of nodes:");
   int n = sc.nextInt();

   System.out.println("Enter the nodes:");
   for (int i = 0; i < n; i++) {
       int key = sc.nextInt();
       root = insertNode(root, key);
   }

   System.out.print("Pre-Order of tree: ");
   preorder(root);
   System.out.println();

   System.out.print("Post-Order of tree: ");
   postorder(root);
   System.out.println();

   System.out.print("In-Order of tree: ");
   inorder(root);
   System.out.println();
}

    
}
