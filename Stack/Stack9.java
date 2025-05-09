// import java.util.Stack;
// public class Stack9 {
//     public static boolean isDuplicated(String str){
//         Stack<Character>s=new Stack<>();

//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
        
//              //cosing 
//             if(ch=='('){
//               int count=0;
//               while (!s.isEmpty()&&s.peek()!=')') {    
//                 s.pop();
//                 count++;
//               }if(count < 1){
//                 return true;
//               }else{
//                 s.pop();
//               }
//             }else{
//                s.push(ch);
//             }

//         }
//         return false;
//     }
//     public static void main(String[] args){
//         String str2="(a-b)";
//         System.out.println(isDuplicated(str2));
//     }

// }
// import java.util.*;
// import java.io.*;
// import java.io.*;
// import java.util.*;
// class StackA{
//     public static int calculate(String s) {
//         int val=Integer.valueOf(s);
//       return val;
        
//     }
//     public static void main(String[] args){
//       String s ="a + b";
//       System.out.println(calculate(s));   
//      }

// }
// Java program to convert String to int
// using Ints::tryParse method

import java.util.ArrayList;
import java.util.List;

class lon {
  public static List<String> letterCombinations(String digits) {
    if(digits.isEmpty())
      return new ArrayList<>();

    List<String> ans = new ArrayList<>();
    ans.add("");
    String[] digitToLetters = {"",    "",    "abc",  "def", "ghi",
                                     "jkl", "mno", "pqrs", "tuv", "wxyz"};

    for (char d : digits.toCharArray()) {
      List<String> temp = new ArrayList<>();
      for ( String s : ans)
        for (char c : digitToLetters[d - '0'].toCharArray())
          temp.add(s + c);
      ans = temp;
    }

    return ans;
  }public static void main(String[] args){
    
    String digit="23";
    System.out.println(letterCombinations(digit));
  }
}