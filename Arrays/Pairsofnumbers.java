package Arrays;

public class Pairsofnumbers {
    // time complexity = O(n)
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
     int arr[]={4,5,6,2,6,9};
     pair(arr);
    }
}
