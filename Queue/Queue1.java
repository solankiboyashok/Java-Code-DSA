//create queue with help of arr[]
package Queue;

public class Queue1 {
       static class Queue{
       static int arr[];
       static int size;
        static int rear;
          
      Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
       }

       public boolean isEmpty(){
        return rear==-1;
       }

     //Add
     public void enqueue(int data){
        if(rear==size-1){
          System.out.println("queue is full");
        return;
        }
            rear=rear+1;
            arr[rear]=data;
        
     }

     //remove
     public int Dequeue(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int frant=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return frant;
     }
       
     //peek
     public int peek(){
        if(isEmpty()){
            System.out.println("queue isempty");
            return -1;
        }
        return arr[0];
            }
       }
     public static void main(String [] args){
        Queue q=new Queue(5);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(2);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.Dequeue();
            
        }
     }
    
}
