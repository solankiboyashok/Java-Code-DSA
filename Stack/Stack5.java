import java.util.Stack;

public class Stack5 {

    public static String reverse(String str){
        //create a character typing stack
        Stack<Character>sc=new Stack<>();
        int idx=0;
        
        while(idx<str.length()){
            sc.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder();
        while (!sc.isEmpty()) {
            char curr=sc.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String [] args){
        String str="Ashok ";
        System.out.println(reverse(str));

    }
    
}
