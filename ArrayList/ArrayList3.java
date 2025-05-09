//swap two number inside the arraylist

package ArrayList;

import java.util.*;

public class ArrayList3 {
    public static void swap(ArrayList<Integer>list,int ptr1,int ptr2){
    int temp=list.get(ptr1);
    list.set(ptr1, list.get(ptr2));
    list.set(ptr2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(66);
        list.add(44); 
        list.add(4);
        list.add(22);
        list.add(43);
        // int ptr1=1;
        // int ptr2=3;
        // System.out.println("Old list:"+list);
        // swap(list, ptr1, ptr2);
        // System.out.println("New list:"+list);


       //with help collections you can list of array in increasing order.
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
       //you can use revrseorder then list will be print in decreasing order.
        Collections.sort(list,Collections.reverseOrder());
        

    }
}
