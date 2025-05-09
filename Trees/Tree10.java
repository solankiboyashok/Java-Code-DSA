package Trees;
import java.util.*;
 class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data)
    {
        this.data = data;
       this.left = null;
        this.right = null;
    }
}
class Tree10{

   public static List<List<Integer>> levelOrder(TreeNode root){
       Queue<TreeNode> q = new LinkedList<>();
       List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
       if(root==null)
       {
           return finalAns;
       }
       q.add(root);
       while(!q.isEmpty())
       {
           int levels = q.size();
           ArrayList<Integer> subLevels = new ArrayList<>();
           for(int i=0;i<levels;i++)
           {
               if(q.peek().left!=null)
               {
                   q.add(q.peek().left);
               }
               if(q.peek().right!=null)
               {
                   q.add(q.peek().right);
               }
               subLevels.add(q.remove().data);
           }
           finalAns.add(subLevels);
       }
       return finalAns;
   }
   public static void main(String[] args)
   {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(8);
    root.right  = new TreeNode(12);
    root.left.left = new TreeNode(6);
    root.left.right= new TreeNode(9);
    root.right.left = new TreeNode(11);
    root.right.right = new TreeNode(13);
    System.out.println("\n Level order traversal:\n");
    System.out.println(levelOrder(root));
   }
}