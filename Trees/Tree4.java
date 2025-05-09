// package Trees;

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
//         public static List<Integer> Rightview(Binary root){
            
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
//             helper(root.right, level+1, ans);
//             helper(root.left, level+1, ans);
            
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
//             System.out.println(Rightview(root));
//         }
// }
package Trees;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Tree4 {
    public static class Binary {
        int data;
        public Binary left;
        public Binary right;

        public Binary(int data) {
            this.data = data;
        }
    }

    public static List<Integer> Leftview(Binary root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, 0, ans);
        return ans;
    }

    public static void helper(Binary root, int level, List<Integer> ans) {
        if (root == null) {
            return;
        }
        if (level == ans.size()) {
            ans.add(root.data);
        }

        // Left view tree
        helper(root.left, level + 1, ans);
        helper(root.right, level + 1, ans);
    }

    public static Binary insert(Binary root, int val) {
        if (root == null) {
            return new Binary(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary root = null;

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter the values of the nodes:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        System.out.println("Left view of the tree: " + Leftview(root));
    }
}
