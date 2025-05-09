package Trees;
 
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree11 {
    public static boolean isValidBST(TreeNode root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean helper(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.data<=min||root.data>=max){
            return false;
        }
        return helper(root.left,min,root.data)&&helper(root.right,root.data,max);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(isValidBST(root));

    }
    
}
