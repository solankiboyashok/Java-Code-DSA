import java.util.*;
class StackAll{
    public static void Pushat(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        Pushat(s,data);
        s.push(top);
    }
    public static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return ;
        }
        int top=s.pop();
        reverse(s);
        Pushat(s,top);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Stack<Integer> s = new Stack<>();

    System.out.print("Enter number of elements to push into stack: ");
    int n = sc.nextInt();

    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
        s.push(sc.nextInt());
    }

    System.out.print("Enter the element to insert at bottom: ");
    int data = sc.nextInt();

    reverse(s);         // First reverse the stack
    // Pushat(s, data);    // Then insert at bottom

    System.out.println("Stack after reversing and inserting at bottom:");
    while (!s.isEmpty()) {
        System.out.println(s.pop());
    }

    sc.close();


        // int n=sc.nextInt();
        
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // Stack<Integer>s=new Stack<>();

        // for(int num:arr){
        //     s.push(num);
        // }
        // while(!s.isEmpty())
        // {
        //     System.out.print(s.pop()+" ");
        // }

    // String str="({[})";
    // Stack<Character>s=new Stack<>();
    // for(char ch:str.toCharArray()){
    //     if(ch=='('||ch=='['||ch=='{'){
    //         s.push(ch);
    //     }else{
    //         if(s.isEmpty()){
    //             System.out.print(false);
    //         }
    //         char top=s.pop();
    //         if(ch==')'&&top!='('||ch=='}'&&top!='{'||ch==']'&&top!='['){
    //             System.out.println(false);
    //         }
    //     }
    // }
    // System.out.println(true);

    }
}