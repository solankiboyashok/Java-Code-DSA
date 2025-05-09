//creating a circule queue.
package Queue;
public class Queue2 {
       static class Queue{
       static int arr[];
       static int size;
        static int rear;
        static int frant;
          
      Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
        frant=-1;
       }

       public boolean isEmpty(){
        return rear==-1 && frant==-1;
       }
       public static boolean isFull(){
        return (rear+1)%size==frant;
       }

     //Add
     public void add(int data){
        if(isFull()){
          System.out.println("queue is full");
        return;
        }
        //add first element
        if(frant==-1){
            frant=0;
        }
            rear=(rear+1)%size;
            arr[rear]=data;
     }

     //remove
     public int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int result=arr[frant];
        //remove last element
        if(rear==frant){
            rear=frant=-1;
        }else{
            frant=(frant+1)%size;
        }
        return result;
     }
       
     //peek
     public int peek(){
        if(isEmpty()){
            System.out.println("queue isempty");
            return -1;
        }
        return arr[frant];
            }
       }
     public static void main(String [] args){
        Queue q=new Queue(5);
        q.add(3);
        q.add(5);
        q.add(2);

        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
     }
    
}


