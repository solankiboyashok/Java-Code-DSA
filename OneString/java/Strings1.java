package OneString.java;

import java.util.Scanner;

public class Strings1 {
    public static boolean palindrome(String str1){
       int n=str1.length();
       for(int i=0;i<n/2;i++){
        if(str1.charAt(i)!=str1.charAt(n-i-1)){
            return false;
        }
        
       }
       return true;

    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String str1=sc.nextLine();
    boolean drome= palindrome(str1);
    System.out.println(drome);       
    }
}
    
