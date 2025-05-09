package Arrays;

import java.util.HashMap;

public class Subarrays {
    static int maxLen(int arr[])
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int max=0;
        int i=-1;
        for( i=0;i<arr.length;i++){
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }else{
                int length=i-map.get(sum);
                if(length>max){
                    max=length;
                }
            }

        }
        return max;
    }
    // {
    //     int length = Integer.MIN_VALUE;
    //     for (int i = 0; i < N; i++) {
    //         int curr_sum = 0;
    //         for (int j = i; j < N; j++) {
    //             curr_sum += arr[j];
    //             if (curr_sum == 0)
    //                 length = Math.max(length, j - i + 1);
    //         }
    //     }
    //     return length;
    // }
        
    public static void main(String[] args){
        int arr[]={3,2,-1,6,-10,4,7,-9,3,-5,4,-2};
        int N=arr.length;
        System.out.println(maxLen(arr));
    }
}