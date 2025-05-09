package Arrays;

public class maxproductofsubarray {
    // Uncomment and complete the method if needed
    // public static int product(int arr[]){
    //    int maxproduct=Integer.MIN_VALUE;
    //    for(int i=0;i<arr.length;i++){
    //        int currentproduct=1;
    //        for(int j=i;j<arr.length;j++){
    //            currentproduct*=arr[j];
    //            if(maxproduct<currentproduct){
    //                maxproduct=currentproduct;
    //            }
    //        }
    //    }
    //    return maxproduct;
    // }
    public static int KadansAlogrithm(int arr[]){
        int currproduct=1;
        int maxproduct=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          currproduct=currproduct*arr[i];
          maxproduct=Math.max(maxproduct, currproduct);
          if(currproduct==0){
            currproduct=1;
          }
        }
        return maxproduct;
      }
    public static void main(String[] args){
        int arr[]={3,5,4,-8,0,12,5,2,0,6,-3,9,8};
       // System.out.println(product(arr));
        System.out.println(KadansAlogrithm(arr));
    }
  }

