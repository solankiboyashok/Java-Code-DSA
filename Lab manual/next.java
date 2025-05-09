import java.util.Stack;

public class next {
    public static void main(String[] args){
        int arr[]={3,7,5,9,12,8,15};
        Stack<Integer>s=new Stack<>();
        int nextGreater[]=new int[arr.length];
        nextGreater[arr.length-1]=-1;
        s.push(arr[arr.length-1]);
         for(int i=arr.length-2;i>=0;i--){
            while(!s.isEmpty() && arr[i]>s.peek()){
                s.pop();
            }
            if(s.size()==0){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=s.peek();
            }
            s.push(arr[i]);
         }
          for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}
