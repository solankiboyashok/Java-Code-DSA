package Queue;

import java.util.Deque;
import java.util.LinkedList;

//double ended queue-(deque)
public class Queue9 {
    public static void main(String[] args) {
        Deque<Integer>d=new LinkedList<>();
        d.addFirst(2);//first add the element
        d.addFirst(5);
        d.addFirst(4);
        d.addLast(1);//last add the element
        d.addLast(5);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);

        System.out.println("first element="+d.getFirst());
        System.out.println("last elementa="+d.getLast());
        d.element();
        System.out.println(d);
    }
}
