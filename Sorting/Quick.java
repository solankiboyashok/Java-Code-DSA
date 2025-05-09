package Sorting;

public class Quick {
    public static int quicksort(int arr[],int low ,int high){
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low;j<high;j++){
           if(arr[j]<=pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }
    public static void sort(int arr[], int low ,int high){
        if(low<high){
            int p=quicksort(arr, low, high);
             sort(arr, low,p-1);
             sort(arr, p+1, high);
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={3,1,4,5,2};
        sort(arr, 0,arr.length-1);
        print(arr);

    }

}
