package Hashmap;

import java.util.HashMap;
public class Hashmap1 {
    public static void main(String args[]){
     HashMap<String,Integer>free=new HashMap<>();
     //insert -put 
     free.put("India",120);
     free.put("china",100);
     free.put("Us",50);
     System.out.println(free);
      
    // find -get
    int dam=free.get("Us");
    System.out.println(dam);

    // contain or not -containKey
    System.out.println(free.containsKey("surat"));
    System.out.println(free.containsKey("India"));
    System.out.println(free.containsValue(50));
    System.out.println(free.isEmpty());
    System.out.println(free.size());
    System.out.println(free.remove("India"));
    System.out.println(free.remove("surat"));

    }
}
