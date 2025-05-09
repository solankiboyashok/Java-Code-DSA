
// public class Stack12 {
//     public static int rainWater(int arr[]){
//         int n=arr.length;
//         int left[]=new int[arr.length];
//         int right[]=new int[arr.length];
//         left[0]=arr[0];
//         for(int i=0;i<n;i++){
//             left[i]=Math.max(left[i-1], arr[i]);
//         }
//         right[n-1]=arr[n-1];
//         for(int i=n-2;i>=0;i--){
//             right[i]=Math.max(right[i+1],arr[i]);
//         }
//         int ans=0;
//         for(int i=0;i<n;i++){
//             ans+=(Math.min(left[i],right[i])-arr[i]);
//         }
//         return ans;
//     }
   
//     public static void main(String[] args){
//         int arr[]={7,0,4,2,5,0,6,4,0,6};
//         System.out.println(rainWater(arr));
//     }
// }
   
import java.util.Stack;
class Stack12{
    public static int maxWater(int height[]){
    //create stack with help of collection framework.
     Stack<Integer> stack=new Stack<>();
     int n=height.length;
     int ans=0;
        for(int i=0;i<n;i++){
            //1st condition stack is not empty and inside the arr peek value is greater the  i
            while (!stack.isEmpty()&&(height[stack.peek()]<height[i])) {
                //then arr of peek value store new variable.
                int pop_height=height[stack.peek()];
                //then pop inside the stack
                stack.pop();
                //stack is empty then break the stack
                if(stack.isEmpty()){
                break;
                }
                //
                int distance=i-stack.peek()-1;
                int min_height=Math.min(height[stack.peek()],height[i])-pop_height;
                ans +=distance*min_height;
            }
            stack.push(i);
        }
         return ans;
    }
    public static void main(String[] args){
     int arr[]={6,8,0,2,5,0,6,4,0,6};
     System.out.println(maxWater(arr));
    }
}


