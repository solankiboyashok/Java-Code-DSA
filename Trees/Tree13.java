package Trees;

public class Tree13 {
 static class TreeNode{
    int data;
    TreeNode Left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.Left=null;
        this.right=null;
    }
}
public static boolean isvalid(TreeNode root){
 return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
}
public static boolean helper(TreeNode root,long min,long max){
    if(root==null){
        return true;
    }
    if(root.data<=min||root.data>=max){
        return false;
    }
    return helper(root.Left, min, root.data)&&helper(root.right, root.data, max);
}
public static void main(String[] args){
    TreeNode root =new TreeNode(4);
    root.Left=new TreeNode(3);
    root.right=new TreeNode(6);

    System.out.println(isvalid(root));
}
}
