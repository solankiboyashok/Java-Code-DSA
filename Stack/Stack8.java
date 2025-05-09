import java.util.*;

public class Stack8 {
    
//     public static void main(String[] args){
//         int arr[]={3,7,5,9,12,8,15};
//         Stack<Integer>s=new Stack<>();
//         int nextGreater[]=new int[arr.length];

//         for(int i=arr.length-1;i>=0;i--){
//             while (!s.isEmpty()&&arr[s.peek()]<=arr[i]) {
//             s.pop();
                
//             }if(s.isEmpty()){
//             nextGreater[i]=-1;
//             }else{
//              nextGreater[i]=arr[s.peek()];
//             }
//             s.push(i);
//         }
//         for(int i=0;i<nextGreater.length;i++){
//             System.out.print(nextGreater[i]+" ");
//         }
//         System.out.println();
//     }
// }
// import java.util.Stack;

// class Stack8 {
//     public static int[] nextGreaterElements(int[] nums) {
//         Stack<Integer>s=new Stack<>();
//         int n=nums.length;
//         int[] a=new int[n];
//         for(int i=n-1;i<=0;i--){
//             if(!s.isEmpty()&&nums[s.peek()]<=nums[i]){
//                 s.pop();
//                 if(s.isEmpty()){
//                  a[i]=-1;
//                 }else{
//                     a[i]=nums[s.peek()];
//                 }
//                 s.push(i);
//             }
//         }
    
//       return a;
//     }
//     public static void main(String[] args) {
//         int nums[]={3,7,5,9,12,8,15};
//         System.out.println(nextGreaterElements(nums));
//     }
//}

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
