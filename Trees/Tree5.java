 package Trees;

public class Tree5 {
    static class TreeNode{
        int data;
        public TreeNode left;
        public TreeNode right;     
        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;         
        }
    }
    public static TreeNode lca(TreeNode root,int i,int j){
      if(root==null || root.data==i || root.data==j){
        return root;
      }
      TreeNode l= lca(root.left, i, j);
      TreeNode r=lca(root.right, i, j);
      if(l==null){
        return r;
      }else if(r==null){
        return l;
      }else{
        return root;
      }
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(5); 
        root.right=new TreeNode(1);
         root.left.left=new TreeNode(6); 
         root.left.right=new TreeNode(2); 
         root.right.left=new TreeNode(0);
         root.right.right=new TreeNode(8);
         root.left.right.left=new TreeNode(7);
         root.left.right.right=new TreeNode(4);
         int i=5;
         int j=4; 
         TreeNode lca = lca(root, i, j);
         
         if(lca!=null){
          System.out.println("LCA of "+i+" and "+j+" is: "+lca.data);
         }else{
          System.out.println("LCA not found");
         }
    }
    
}