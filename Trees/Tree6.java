package Trees;

import java.util.ArrayList;
import java.util.List;

public class Tree6 {
    public static class TreeNode{
        int data;
        public TreeNode left;
        public TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }
  
    public static boolean helper(TreeNode root,int x,List<Integer>arr){
        if(root==null)
        return false;
        arr.add(root.data);
        if(root.data==x)
        return true;

        if(helper(root.left, x, arr)||helper(root.right, x, arr)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }      
    
    
    
    public static void main(String[] args){
        List<Integer>ans=new ArrayList<>();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.left.right.left=new TreeNode(9);
        root.left.right.right=new TreeNode(8);
        root.right.left.left=new TreeNode(10);
        helper(root, 8, ans);
        System.out.println(ans);
      
    }
}

