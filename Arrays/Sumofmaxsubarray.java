package Arrays;

public class Sumofmaxsubarray {
//complexity =O(n*n)  
  //   public static int subarray(int arrr[]){
  //       int currsum=0;
  //       int maxsubarray=Integer.MIN_VALUE;
    
  //      int n=arrr.length;      
  //      for(int i=0;i<n;i++){
  //        int start=i;
  //        for(int j=i;j<n;j++){
  //          int end=j;
  //          currsum=0;
  //          for(int k=start;k<=end;k++){
  //              currsum+=arrr[k];
  //          }
  //          System.out.println(currsum);
  //          if(maxsubarray<currsum){
  //           maxsubarray=currsum;
  //          }
  //        }
  //    }
  //    return maxsubarray;
  //  }
  //  public static void main(String[] args){
  //   int arrr[]={2,4,6,8,10};
  //   System.out.println(subarray(arrr));
  //  }

  //complexity=O(n)
  //Kadances Alogritm in subarray
  public static int KadansAlogrithm(int arr[]){
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      currsum=currsum+arr[i];
      if(currsum<0){
        currsum=0;
      }
      maxsum=Math.max(maxsum, currsum);
    }
    return maxsum;
  }
    public static void main(String[] args){
      int arr[]={2, 3, -8, 7, -1, 2, 3};
      System.out.print("Maximum sum of subarray:");
      System.out.print(KadansAlogrithm(arr));
    }
  }

