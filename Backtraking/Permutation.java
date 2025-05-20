package Backtraking;

public class Permutation {
    public static void PrintPermutation(String str, String prem,int idx){
        if(str.length()==0){
            System.out.println(prem);
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            PrintPermutation(newString, prem+ch, idx+1);
        }
    }
    public static void main(String[] args){
        String str="ABS";
        PrintPermutation(str, "", 0);
    }
}
