// public class import {
    
// }
// List<String> name=List.of("hello","world");

// public static <T> List<T> of(T... t);
// public static <K,V> Map.Entry<K,V> entry(K key,V value);
// Map<Integer,String> digitsToWords=Map.ofEntries(Map.entry(1,"one"),Map.entry(1,"Two"));
class impor{
    public static void main(String args[]){
        int num=1;
        try{
            int result=num/0;
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
//