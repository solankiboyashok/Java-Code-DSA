import java.util.Stack;

public class Stack11 {
    public static void main(String[] args) {
        Stack<Double> s = new Stack<>();
        double r = 0;
        double op1, op2;

        // Take input as a postfix expression
        String postfix = "436+*8-"; // Example postfix expression
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch)) {
                s.push((double) (ch - '0'));
            } else {
                op2 = s.pop(); // Second operand
                op1 = s.pop(); // First operand
                switch (ch) {
                    case '+':
                        r = op1 + op2;
                        break;
                    case '-':
                        r = op1 - op2;
                        break;
                    case '*':
                        r = op1 * op2;
                        break;
                    case '/':
                        r = op1 / op2;
                        break;
                }
                s.push(r);
            }
        }
        System.out.println("Result: " + s.pop());
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
