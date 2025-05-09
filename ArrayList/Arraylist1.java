package ArrayList;
import java.util.*;
public class Arraylist1 {
    public static void main(String[] args){
        //create arraylist with help of collection framework.
        ArrayList<Integer> list=new ArrayList<>();

        //add number inside the list - O(1)
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);

        // //O(n)
        // list.add(2,3);

        // //remove the element inside the list with help of index - O(n)
        // list.remove(5);
    
        //get method use to find number given a index number-O(1)
        //int a=list.get(3);
        // System.out.println(a);

        // System.out.println(list);
        // //with help set method you can change value of given index-O(n)
        // list.set(2, 55);
        
        // System.out.println(list);
        // //contains method check the given element aggest on not.-O(n)
        //  System.out.println(list.contains(5));//true
        //  System.out.println(list.contains(55));//false
         
        //size method return size of list
        //  System.out.println( list.size());
        
         for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
         }
        
        /*Question reverse list */
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i)+" ");
        }
        
    }
}
