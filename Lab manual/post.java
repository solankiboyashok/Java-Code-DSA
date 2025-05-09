import java.util.Stack;

import java.util.*;
public class post {
    public static void main(String[] args){

        Stack<Integer>s=new Stack<>();
        int r=0;
         int op1,op2;
        char a[]={'4','3','6','+','*','8','-'};
        for(int i=0;i<a.length;i++){
        char ch =a[i];
            if(Character.isDigit(ch)){
                s.push(ch-'0');
            }else{
                op2=s.pop();//6
                op1=s.pop();//3
                if(ch=='+'){
                    r=op1+op2;
                }else if(ch=='-'){
                    r=op1-op2;
                }else if(ch=='*'){
                    r=op1*op2;
                }else if(ch=='/'){
                    r=op1/op2;
 
                }
                s.push(r);
        
            }
        }
        System.out.println("Result:"+s.pop());
        
    }
}


