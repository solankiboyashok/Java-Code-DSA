package Hashmap;

import java.util.HashMap;

public class Anagram {
   
   //  @SuppressWarnings("unlikely-arg-type")
   // public static boolean ans(String s,String t){
   //   HashMap<Character,Integer>hash=new HashMap<>();
   //   char a[]=s.toCharArray();
   //   int count =0;
   //   for(int i=0;i<a.length;i++){
   //      count+=a[i];
        
   //      hash.put(a[i],count);
       
   //   }
   //   char b[]=t.toCharArray();
   //   for(int i=0;i<b.length;i++){
   //      if(b[i]==a[i]){
   //          hash.remove(count);
   //      }
   //   }
   //   if(hash.size()==0){
   //      return true;
   //   }else{
   //      return false;
   //   }
  
   //  }
   //  public static void main(String [] args){
   //      String s= "dad";
   //      String t= "dda";
   //      System.out.println(ans(s, t));
   //  }

   
   public static boolean Ana(String s,String t){
      if (s.length() != t.length()) {
         return false;
     }
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++){
         char ch =s.charAt(i);
         map.put(ch, map.getOrDefault(ch, 0)+1);
         
      }
      for(int i=0;i<t.length();i++){
         char ch=t.charAt(i);
         if(map.containsKey(ch)){
            if(map.get(ch)==1){
               map.remove(ch);
            }else{
               map.put(ch,map.get(ch)-1);
            }
         }
      }
      if(map.size()==0){
         return true;
      }else{
         return false;
      }
   }
   public static void main(String [] args){
      String s="dad";
      String t="dda";
      System.out.println(Ana(s, t));
   }
}
