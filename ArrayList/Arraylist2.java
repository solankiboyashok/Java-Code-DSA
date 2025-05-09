//Find the Maximum and Minimum number of array.

package ArrayList;
import java.util.*;
public class Arraylist2 {
    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
      list.add(66);
      list.add(44); 
      list.add(4);
      list.add(22);
      list.add(43);
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<list.size();i++){
        // if(max<list.get(i)){
        //     max=list.get(i);
        // }
        //or other method
        max=Math.max(max,list.get(i));
        min=Math.min(min, list.get(i));

      }
      System.out.println("Maximum element of list:"+max);
      System.out.println("Minimum element of list:"+min );

      
    }   
}
