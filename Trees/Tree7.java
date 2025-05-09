package Trees;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
     class Tree7 {
        public static List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        if (root != null){  
        searchBT(root,"", answer);
        }
        return answer;
    }
    public static void searchBT(TreeNode root, String s, List<String> answer) {
        if (root.left == null && root.right == null){ 
        answer.add(s + root.val );
        }
        if (root.left != null){ 
        searchBT(root.left, s + root.val + "->", answer);
        }
        if (root.right != null){ 
        searchBT(root.right, s + root.val + "->", answer);
        }
    }
    public static void main(String[] args){
     TreeNode root=new TreeNode(1);
     root.left=new TreeNode(2);
     root.left.right=new TreeNode(5);
     root.right=new TreeNode(3);
     System.out.println(binaryTreePaths(root));
    }
    
}