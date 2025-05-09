import java.util.Stack;
public class Stack10 {
   
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        //next smaller Right
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
           while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
               s.pop();
            }if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
           while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
               s.pop();
            }if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //current width=j-i-1=nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int weight=nsr[i]-nsl[i]-1;
            int currArea=height*weight;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("maximum are of histogram:"+maxArea);

    }
    public static void main(String[] args){
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
}
