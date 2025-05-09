import java.util.Stack;
public class Stack3 {
    public static void main(String[] args){
        Stack<Integer>s=new Stack<>();
        s.push(5);
        s.push(6);
        s.push(3);
        s.push(8);
        System.out.println("it's a Top value of stack:"+s.peek());
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            s.peek();
        }
        
    }

}
