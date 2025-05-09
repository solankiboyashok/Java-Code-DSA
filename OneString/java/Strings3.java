package OneString.java;

public class Strings3 {
    public static String substring(String str ){
      String substr="";
      for(int i=0; i<5;i++){
        substr+=str.charAt(i);
      }
      return substr;
    }

    public static void main(String[] args){
     String str="helloworld";
     //System.out.println(substring(str));
     System.out.println(str.substring(0, 5));
    }
}
