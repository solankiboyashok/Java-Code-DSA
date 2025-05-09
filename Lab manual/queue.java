public class queue {
    int [] data;
    int size;
    int front;
    int rear;
    public queue(){
        data = new int[5];
        size=0;
        rear=0;
        front=0;

    }
    public void enqueue(int value){
        if (size== data.length){
            System.out.println(" queue overflow");
            return;
        }else {
            rear=(front+size)%data.length;
            data[rear]=value;
            size++;
        }
    }
    public int dequeue(){
        if (size==0){
            System.out.println(" queue underflow");
            return -1;
        }else {
            int val=data[front];
            size--;
            front=(front+1)% data.length;
            return val;
        }
    }
    public void display(){
        for (int i=0;i<size;i++){
            int index=(i+front)% data.length;
            System.out.println(data[index]+" ");
        }
    }
    public int rear(){
        return  rear;
    }
    public int front(){
        return front;
    }

    public static void main(String[] args) {
        queue queue=new queue();
        int[]arr={5,6,1,4,9};
        for (int value:arr){
            queue.enqueue(value);
        }
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.dequeue();
        queue.display();
    }
}