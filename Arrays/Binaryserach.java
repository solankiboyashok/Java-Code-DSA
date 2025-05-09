package Arrays;
//time-complexity=O(log n) it is best case as compares to linear search.
//space-complexity=O(1)
public class Binaryserach {
    public static int binaryserach(int arr[],int key){
        int start=0,end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
              return mid;
            }
            if(arr[mid]<key){
              start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={1,3,4,5};
        int key=4;
        System.out.println(binaryserach(arr, key));
    }
}
