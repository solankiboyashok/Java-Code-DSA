package Arrays;
//time complexity =O(n)
//space complexity=O(1)
public class Reverse {
 public static void reverse(int arr[]){
   int start=0;
   int end=arr.length-1;
  while (start<end) {
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
  }
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
 
 }  
 public static void reverseburstcase(int arr[]){
    int n=arr.length;
    int a[]=new int[n];
    int j=n;
    for(int i=0;i<n;i++){
        a[j-1]=arr[i];
        j--;
    }
    for(int k=0;k<n;k++){
        System.out.print(a[k]+" ");
    }
 }
 public static void main(String[] args){
    int arr[]={3,52,1,4,5};
   // reverse(arr);
    reverseburstcase(arr);

 }  
}
