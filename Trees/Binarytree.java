package Trees;
import java.util.*;
public class Binarytree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    public static Node insert(Node root,int val){
        Node newNode=new Node(val);
        if(root==null){
            return new Node(val);
        }
        Queue<Node>q=new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp.left==null){
                temp.left=new Node(val);
                break;
            }else{
                q.add(temp.left);
            }
            if(temp.right==null){
                temp.right=new Node(val);
                break;
            }else{
                q.add(temp.right);
            }
         }
         return root;
    }
    public static void levelOrder(Node root){
        if(root==null)return ;
        Queue<Node>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+ " ");
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node root=null;
        for(int i=0;i<arr.length;i++){
          root=insert(root, arr[i]);
        }
        levelOrder(root);
    }
}
