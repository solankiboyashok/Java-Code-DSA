package OneString.java;

import java.util.Scanner;

public class String7 {
    public static int LCS(String str1,String str2){
        int maxLength=0;
        int dp[][]=new int[str1.length()+1][str2.length()+1];

        for(int i=1;i<=str1.length();i++){

            
            for(int j=1;j<=str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                   if(maxLength<dp[i][j]){
                    maxLength=dp[i][j];
                   }else{
                    dp[i][j]=0;
                   }
                }
            }
            
        }
        return maxLength;

    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    int result=LCS(str1, str2);
    System.out.println(result);
    }
}
