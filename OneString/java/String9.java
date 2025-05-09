package OneString.java;

import java.util.Scanner;

public class String9 {
    public static String reversWord(String s){
        String[] parts = s.trim().split("\\s+");
        StringBuilder reverse = new StringBuilder();
        for(int i=parts.length-1;i>=0;i--){
           reverse.append(parts[i]);
           if(i>0){
            reverse.append(" ");
           }
        }
        return reverse.toString();
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String result=reversWord(s);
    System.out.println(result);
    }
}
