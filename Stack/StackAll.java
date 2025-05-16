import java.util.*;
class StackAll{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


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

    String str="({[})";
    Stack<Character>s=new Stack<>();
    for(char ch:str.toCharArray()){
        if(ch=='('||ch=='['||ch=='{'){
            s.push(ch);
        }else{
            if(s.isEmpty()){
                System.out.print(false);
            }
            char top=s.pop();
            if(ch==')'&&top!='('||ch=='}'&&top!='{'||ch==']'&&top!='['){
                System.out.println(false);
            }
        }
    }
    System.out.println(true);

    }
}