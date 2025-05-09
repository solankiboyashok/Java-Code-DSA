package OneString.java;
import java.util.*;

public class Strings2{
    public static float ShortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='N'){
                y++;
            }else if(c=='E'){
                x++;
            }else if(c=='W'){
                x--;
            }else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
 public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
  
    String str=sc.nextLine();
    float result=ShortestPath(str);
    System.out.println(result);


 }
}