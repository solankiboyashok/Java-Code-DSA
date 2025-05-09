// package Trees;

// public class tree2 {
//     public static class Node{
//         int data;
//        public  Node left;
   
//        public Node right;
       
//         public Node(int data){
//            this.data=data;
//            }
//         }

//     public static int height(Node root){
//         if(root==null){
//             return 0;
//         }
//         int l=height(root.left);
//         int r=height(root.right);
//         int a=Math.max(l, r)+1;
//         return a;
//     }
//     public static int sum(Node root){
//         if(root==null){
//             return 0;
//         }
//         int l=sum(root.left);
//         int r=sum(root.right);
//         int c=(l+r)+root.data;
//         return c;
        
//     }

//         public static void main(String[] args){
//             Node root=new Node(10);
//             root.left=new Node(7);
//             root.right=new Node(15);
//             root.left.left=new Node(6);
//             root.left.right=new Node(12);
//             root.right.left=new Node(8);
//             System.out.print("height of tree:");
//             System.out.println(height(root));
//             System.out.println(sum(root));
//         }
// }

package Trees;

import java.util.Scanner;
public class tree2 {
static class Node{
        int data;
       public  Node left;
   
       public Node right;
       
        public Node(int data){
           this.data=data;
           }
        }

    public static int MaxDepth(Node root){
        if(root==null){
            return 0;
        }
        int l=MaxDepth(root.left);
        int r=MaxDepth(root.right);
        int a=Math.max(l, r)+1;
        return a;
    }
    public static Node insert(Node root,int val ){
       if(root==null){
        return new Node(val);
       }
       if(val<root.data){
        root.left=insert(root.left, val);
       }else if(val>root.data){
        root.right=insert(root.right, val);
       }
       return root;

    }

        public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
        
           Node root=null;
           int n=sc.nextInt();
           for(int i=0;i<n;i++){
            int val=sc.nextInt();
            root=insert(root, val);
           }
           int result=MaxDepth(root);
           System.out.print("Depth of the tree:"+result);


            // Node root=new Node(10);
            // root.left=new Node(7);
            // root.right=new Node(15);
            // root.left.left=new Node(6);
            // root.left.right=new Node(12);
            // root.right.left=new Node(8);
           
            // System.out.print(MaxDepth(root));
           
        }
}
