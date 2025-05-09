import java.util.Stack;
public class Stack13 {
   static class Node{
      int data;
      Node next;
      Node(int data){
          this.data=data;
          this.next=null;
      }
    }
      public static boolean isPalindrome(Node head){
        Node slow=head;
        Stack<Integer>stack=new Stack<>();
        while (slow!=null) {
            stack.push(slow.data);
            slow=slow.next;
        }while (head!=null) {
            int i=stack.pop();
            if(head.data==i){
            }else{
                break;
            }
            head=head.next;
        }
        return false;
    }


public static void main(String args[]){
     Node one = new Node(1);
      Node two = new Node(2);
      Node three = new Node(3);
      Node four = new Node(4);
      Node five = new Node(3);
      Node six = new Node(2);
      Node seven = new Node(1);
      one.next = two;
      two.next = three;
      three.next = four;
      four.next= five;
      five.next= six;
      six.next= seven;
      boolean condition = isPalindrome(one);
      System.out.println("Palindrome :" + condition);
      
      }
}
