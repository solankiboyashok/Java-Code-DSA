package Arrays;

import java.util.Arrays;

public class Rank {
    
        public static int[] arrayRankTransform(int[] arr) {
            int n=arr.length;
            int a[]=new int[n];
            for(int i=0;i<arr.length;i++){
                int count=0;
                for(int j=1;j<n;j++){
                    if(arr[i]<arr[j]){
                        a[count]+=1;
                    }
                }
            } return a;
        }
    public static void main(String[] args){
     int arr[]={40,10,20,30};
     Arrays.sort(arr);
     System.out.println(arrayRankTransform(arr));
     System.out.println(Arrays.toString(arr));
    }
}
