package ArrayList;

import java.util.ArrayList;

public class Ak {
public static void main(String[] args) {
    int arr[]={4,6,7,86,44};
    ArrayList<Integer>ak=new ArrayList<>();
    for(int a:arr){
        ak.add(a);
        
    }
    // System.out.println(ak);
   
    Integer[] a2=new Integer[ak.size()];
   a2=ak.toArray(a2);
   for(Integer a3:a2){
    System.out.print(a3+" ");
   }

}
}
