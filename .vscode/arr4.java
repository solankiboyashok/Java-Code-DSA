import java.util.Scanner;

class arr4{
    public static void main(String[] args){
        float N=23456918;
        int count=0;
        for(int i=1;i<9;i++){
            if(N%i==0){
               System.out.println(count);
                count+=1;
               
            }else{
                System.out.println("not found");
            }
        }


    }

}