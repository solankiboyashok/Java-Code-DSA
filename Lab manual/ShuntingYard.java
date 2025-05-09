//Question 5
// import java.util.ArrayDeque;
// import java.util.*;

// public class ShuntingYard {
//     // Function to determine the precedence of operators
//     public static int precedence(char operator) {
//         switch (operator) {
//             case '+':
//             case '-':
//                 return 1;
//             case '*':
//             case '/':
//                 return 2;
//             default:
//                 return 0;
//         }
//     }
    

//     public static String infixToPostfix(String infixExpression) {
//         StringBuilder postfix = new StringBuilder();
//         Deque<Character> operatorStack = new ArrayDeque<>();
        
//         String[] tokens = infixExpression.split("\\s+");
        
//         for (String token : tokens) {
//             char firstChar = token.charAt(0);
//             if (Character.isDigit(firstChar) || Character.isLetter(firstChar)) {
//                 postfix.append(token).append(" ");
//             } else if (firstChar == '(') {
//                 operatorStack.push(firstChar);
//             } else if (firstChar == ')') {
//                 while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
//                     postfix.append(operatorStack.pop()).append(" ");
//                 }
//                 operatorStack.pop(); 
//             } else {
//                 while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(firstChar)) {
//                     postfix.append(operatorStack.pop()).append(" ");
//                 }
//                 operatorStack.push(firstChar);
//             }
//         }
        
//         while (!operatorStack.isEmpty()) {
//             postfix.append(operatorStack.pop()).append(" ");
//         }
        
//         return postfix.toString().trim();
//     }
   
//     public static void main(String[] args) {
//         String infixExpression = "3 + 4 * ( 2 - 1 ) / 5";
//         String postfixExpression = infixToPostfix(infixExpression);
//         System.out.println("Postfix notation: " + postfixExpression);
//     }
// }
  //Question-10
   // package Trees;

// public class tree1 {
//   public static class Binary{
//      int data;
//     public  Binary left;

//     public Binary right;
    
//      public Binary(int data){
//         this.data=data;
//         }
//      }
//      public static void preorder(Binary root){
//         if(root==null){
//             return;
//         }
//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//      }
//      public static void postorder(Binary root){
//         if(root==null){
//             return;
//         }
       
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.data+" ");
//      }
//      public static void inorder(Binary root){
//         if(root==null){
//             return;
//         }
       
//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
        
//      }
//     public static void main(String[] args){
//       Binary root=new Binary(10);
//       root.left=new Binary(7);
//       root.right=new Binary(15);
//       root.left.left=new Binary(6);
//       root.left.right=new Binary(12);
//       root.right.left=new Binary(8);

//       System.out.print("pre-Order of tree :"); 
//       preorder(root);
//       System.out.println();
//       System.out.print("Post-Order of tree:");
//       postorder(root);
//       System.out.println();
//       System.out.print("In-Order of tree:");
//       inorder(root);
//     }
    
// }

//Question 18

// import java.util.ArrayList;
// import java.util.List;


// public class Tree4 {
//     public static class Binary{
//         int data;
//        public  Binary left;
   
//        public Binary right;
       
//         public Binary(int data){
//            this.data=data;
//            }
//         }
//         public static List<Integer> Leftview(Binary root){
            
//         List<Integer>ans=new ArrayList<>();
//         helper(root, 0, ans);
//         return ans;
            
//         }
//         public static void helper(Binary root,int level,List<Integer>ans){
//             if(root==null)
//             return;
//             if(level==ans.size()){
//                 ans.add(root.data);
//             }
         
//             helper(root.left, level+1, ans);
//             helper(root.right, level+1, ans);
            
//         }
//         public static void main(String[] args){
//             Binary root=new Binary(1);
//             root.left=new Binary(2);
//             root.right=new Binary(3);
//             root.left.left=new Binary(4);
//             root.left.right=new Binary(5);
//             root.right.left=new Binary(7);
//             root.right.right=new Binary(6);
//             root.left.right.left= new Binary(9);
//             System.out.println(Leftview(root));
//         }
// }


//Question l3
// package Trees;

// public class Tree5 {
//     static class TreeNode{
//         int data;
//         public TreeNode left;
//         public TreeNode right;     
//         TreeNode(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;         
//         }
//     }
//     public static TreeNode lca(TreeNode root,int i,int j){
//       if(root==null || root.data==i || root.data==j){
//         return root;
//       }
//       TreeNode l= lca(root.left, i, j);
//       TreeNode r=lca(root.right, i, j);
//       if(l==null){
//         return r;
//       }else if(r==null){
//         return l;
//       }else{
//         return root;
//       }
//     }
//     public static void main(String[] args){
//         TreeNode root=new TreeNode(2);
//         root.left=new TreeNode(1); 
//         root.right=new TreeNode(3);
//          root.left.left=new TreeNode(4); 
//          root.left.right=new TreeNode(5); 
//          root.right.left=new TreeNode(6);
//          root.right.right=new TreeNode(7);
//          int i=4;
//          int j=7; 
//          TreeNode lca = lca(root, i, j);
         
//          if(lca!=null){
//           System.out.println("LCA of "+i+" and "+j+" is: "+lca.data);
//          }else{
//           System.out.println("LCA not found");
//          }
//     }
    
// }



//}


//Question 12
// package Trees;

// public class tree2 {
//     public static class Binary{
//         int data;
//        public  Binary left;
   
//        public Binary right;
       
//         public Binary(int data){
//            this.data=data;
//            }
//         }

//     public static int MaxDepth(Binary root){
//         if(root==null){
//             return 0;
//         }
//         int l=MaxDepth(root.left);
//         int r=MaxDepth(root.right);
//         int a=Math.max(l, r)+1;
//         return a;
//     }

//         public static void main(String[] args){
//             Binary root=new Binary(10);
//             root.left=new Binary(7);
//             root.right=new Binary(15);
//             root.left.left=new Binary(6);
//             root.left.right=new Binary(12);
//             root.right.left=new Binary(8);
//             System.out.print("Depth of the tree:");
//             System.out.print(MaxDepth(root));
           
//         }
// }

//Question 11
// package Trees;

// public class Tree8 {
//     static class TreeNode{
//         int data;
//         TreeNode left;
//         TreeNode right;
//         TreeNode(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }
//     public static boolean Mirror(TreeNode root1,TreeNode root2){
//         if(root1==null && root2==null){
//             return true;
//         }
//         if(root1==null || root2==null){
//             return false;
//         }
//         return root1.data==root2.data && Mirror(root1.left, root2.right) && Mirror(root1.right, root2.left);
//     }
//     public static void main(String[] args){
//         TreeNode root1=new TreeNode(1);
//         root1.left=new TreeNode(2);
//         root1.right=new TreeNode(3);
//         root1.left.left=new TreeNode(4);
//         root1.left.right=new TreeNode(5);

//         TreeNode root2=new TreeNode(1);
//         root2.left=new TreeNode(3);
//         root2.right=new TreeNode(2);
//         root2.right.left=new TreeNode(5);
//         root2.right.right=new TreeNode(4);

//         boolean Mirrored=Mirror(root1, root2);

//         if(Mirrored){
//            System.out.println("Given trees are mirrored trees.");
//         }else{
//             System.out.println("Given trees are not mirrored trees.");
//         }

//     }
    
// }

//Question 14
//Question BST
// package Trees;

// class BST {
//     int data;
//     BST left;
//     BST right;

//     BST(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// public class Tree9 {
//     public static BST binarysearch(BST root, int d) {
//         if (root == null) {
//             return new BST(d);
//         }

//         if (d > root.data) {
//             root.right = binarysearch(root.right, d);
//         } else {
//             root.left = binarysearch(root.left, d);
//         }
//         return root;
//     }

//     public static void inorder(BST root) {
//         if (root == null) {
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     public static BST search(BST root, int key) {
//         if (root == null || root.data == key) {
//             return root;
//         }

//         if (root.data < key) {
//             return search(root.right, key);
//         }
//         return search(root.left, key);
//     }

//     public static void main(String[] args) {
//         BST root = null;
//         root = binarysearch(root, 10);
//         binarysearch(root, 12);
//         binarysearch(root, 5);
//         binarysearch(root, 32);
//         binarysearch(root, 6);
//         System.out.print("BST: ");
//         inorder(root);
//         System.out.println();

//         int keyToFind = 5;
//         BST result = search(root, keyToFind);
//         if (result != null) {
//             System.out.println("Element " + keyToFind + " found in the tree.");
//         } else {
//             System.out.println("Element " + keyToFind + " not found in the tree.");
//         }
//     }
// }


