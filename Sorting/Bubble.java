package Sorting;

public class Bubble {
     public static void bubblesort(int arr[]){
       for(int term=0;term<arr.length-1;term++){
        for(int j=0;j<arr.length-1-term;j++){
            if(arr[j] > arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
          }
       }
     }
     public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     }
     public static void main(String[] args){
        int arr[]={5,4,3,1,2};
        bubblesort(arr);
        print(arr);
     }
}
