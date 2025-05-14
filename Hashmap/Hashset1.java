package Hashmap;

import java.security.Key;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashset1 {
    public static void main(String [] args) {
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("china",100);
        map.put("India",120);
        map.put("Us",50);
        System.out.println(map.get("Us"));
        Set<String>set= map.keySet();

        for(String str:set){
         System.out.println(str+" "+map.get(str));
        }
        Set<Entry<String, Integer>> set2 = map.entrySet();

        for(Entry<String, Integer> entry : set2){
           System.out.println(entry.getKey() +" : "+ entry.getValue()); 
        }
    }
}
