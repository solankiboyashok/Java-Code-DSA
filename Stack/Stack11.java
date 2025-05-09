import java.util.Stack;

public class Stack11 {
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
        System.out.println(s.pop());
        
    }
}



// import java.util.Stack;

// public class Stack11 {
//    public static int calculat(String s){

//         Stack<Integer>sc=new Stack<>();
//         int r=0;
//          int op1,op2;
        
//         for(int i=0;i<s.length();i++){
//         char ch =s.charAt(i);
//             if(Character.isDigit(ch)){
//                 sc.push(ch-'0');
//             }else{
//                 op2=sc.pop();//6
//                 op1=sc.pop();//3
//                 if(ch=='+'){
//                     r=op1+op2;
//                 }else if(ch=='-'){
//                     r=op1-op2;
//                 }else if(ch=='*'){
//                     r=op1*op2;
//                 }else if(ch=='/'){
//                     r=op1/op2;
 
//                 }
//                 sc.push(r);
        
//             }
//         }
//         return sc.pop();
        
//     }
    
// }
