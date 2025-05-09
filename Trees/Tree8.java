//mirror image or not?
package Trees;

public class Tree8 {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean Mirror(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        return root1.data==root2.data && Mirror(root1.left, root2.right) && Mirror(root1.right, root2.left);
    }
    public static void main(String[] args){
        TreeNode root1=new TreeNode(1);
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(3);
        root1.left.left=new TreeNode(4);
        root1.left.right=new TreeNode(5);

        TreeNode root2=new TreeNode(1);
        root2.left=new TreeNode(3);
        root2.right=new TreeNode(2);
        root2.right.left=new TreeNode(5);
        root2.right.right=new TreeNode(4);

        boolean Mirrored=Mirror(root1, root2);

        if(Mirrored){
           System.out.println("Given trees are mirrored trees.");
        }else{
            System.out.println("Given trees are not mirrored trees.");
        }

    }
    
}
