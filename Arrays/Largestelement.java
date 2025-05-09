package Arrays;

public class Largestelement {
    public static int largestelement(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;

    }
    public static void main(String[] args){
        int arr[]={3,5,2,6,7,8,2};
        System.out.print("Largest element of given array:");
        System.out.print(largestelement(arr));
    }
}
