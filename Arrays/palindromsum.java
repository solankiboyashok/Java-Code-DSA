package Arrays;

import java.util.*;
public class palindromsum {
    public static void main(String [] args){
        int start=10;
        int end=50;
        List<Integer>list=new ArrayList<>();
        for (int i=start;i<=end;i++){
            int curr = i;
           int rev = 0;
            while (curr!=0)
            { int rem = curr% 10;
                curr = curr/ 10;
                rev = rev * 10 + rem;
            }
            if(rev==i){
                list.add(rev);
            }
        }
        int sum=0;
        for(int i=0;i<end;i++){
            sum+=i;
            System.out.println(sum);
        }
        
    }
    
}
