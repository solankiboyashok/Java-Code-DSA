import java.util.Arrays;
public class subsquence {
    public static void main(String[] args){
        int arr[]={4,8,3,9,10,2,5,20,1,20};
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]==1){
                    count++;
                }
            }

        }
         System.out.println(count);
    }
}
