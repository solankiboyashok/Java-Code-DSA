import java.util.Stack;

public class Stack7 {
    public static void stackSpan(int stack[],int span[]){
        Stack<Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);
        
        for(int i=1;i<stack.length;i++){
            int currprince=stack[i];
            while (!s.isEmpty() && currprince>stack[s.peek()]) {
                s.pop();
                
            }if(s.empty()){
                span[i]=i+1;
            }else{
                int priceHigh=s.peek();
                span[i]=1-priceHigh;
            }
            s.push(i);
        }
    }  
    public static void main(String[] args){
        int stack[]={100,80,60,70,60,85,100};
        int span[]=new int[stack.length];
        stackSpan(stack, span);
    }  
}