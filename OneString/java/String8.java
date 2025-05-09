package OneString.java;
import java.util.*;
//Leetcode 58 Length of Last word.
public class String8 {
    public static int LengthLastWord(String s){
        int count=0;
        int i=s.length()-1;
        
      while(i>=0 && s.charAt(i)==' '){
        i--;
      }
      while (i>=0 && s.charAt(i)!=' ') {
        count++;
        i--;
      }
      return count;


      //2 method 
    // String str[]=s.split(" ");
    // return str[s.length()-1].length();
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int result = LengthLastWord(s);
        System.out.println(result);
        
    }
}
