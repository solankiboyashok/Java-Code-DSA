package Arrays;

import java.util.ArrayList;

public class Arr1 {
    public static void main(String[] args){
        int[] arr={4,5,6,2,680};
        ArrayList<Integer>n=new ArrayList<>();
        for(int array:arr){
            n.add(array);
        }
       n.add(1, arr[arr.length-1]);
      n.remove(n.size()-1);
      System.out.println(n);
    }
}
