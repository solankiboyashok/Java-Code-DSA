// // // subarray with zero sum return true if sum=0
// // public class Stack14 {
// //     public static boolean subarray(int arr[]){
        
// //         int n=arr.length;
// //         for(int i=0;i<n;i++){
// //            int sum=0;
           
// //         for(int j=i+1;j<n;j++){
// //             sum+=arr[j];
// //             if(sum==0){
// //                 return true;
// //             }
// //         }
        
// //     }
// //  return false;
// //     }
// //     public static void main(String[] args) {
// //         int arr[]={6,12,8,-10,-12,2,6};
// //         System.out.println(subarray(arr));
// //     }
// // }
//     class Stack14{
//         public static int[] twoSum(int[] n, int target) {
//             for(int i=0;i<n.length;i++){
//                 for(int j=i+1;j<n.length;j++){
//                     if(n[i]+n[j]==target){
//                         int[] a={i+1,j+1};
//                         return a;
//                     }
//                 }
//             }
//             return null;
        
    
//         }
//     public static void main(String[] args){
//         int n[]={4,6,8,3,4,2};
//         int target=12;
//         twoSum(n, target);
//         System.out.println();
//     }
// }

//  import java.util.Arrays;
//  class Stack14{
//      public static void main(String[] args) {
//          int arr[]={4,6,8,3,4,2};
//          int target=10;
//          int n=arr.length;
//          Arrays.sort(arr);
//          int i=0;
//          int j=n-1;
//          while (i<j) {
//             if(arr[i]+arr[j]==target){
//                 System.out.println(i+""+j);
//                 break;
//             }else if(arr[i]+arr[j]<target){
//                 i++;
//               System.out.println(i+""+j);
             
//             }else{
//                 j++;
//                   System.out.println(i+""+j);
//             }
            
//          }
         
//      }
//  }
// class Solution {
//     public static int[] twoSum(int[] num, int target) {
//     //we are use first index i=0 then
//         for(int i=0;i<num.length;i++){
//         //second index start j=i+2
//             for(int j=i+1;j<num.length;j++){
//                 //check number addition equal to target
//                if(num[i] + num[j] == target){
//                    //find the number the addition equal to target 
//                    //then store index form of array int a[].          
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return null;
//     }
//     public static void main(String [] args){
//         int num[]={2,7,11,15};
//         int target=9;
//         System.out.println(twoSum(num,target));
//     }
    
// }

// import java.util.Arrays;

// class Stack14{
    
//         public static int heightChecker(int[] height) {
//             int count=0;
//             int n=height.length;
//             int expected[]=height.clone();//this is use to create a clone of array
//             Arrays.sort(expected);
    
//             for(int i=0;i<n;i++){
            
//                 if(height[i]!=expected[i]){
//                    count++;
//                 }
//             }
//             return count;
//         }
    
//     public static void main(String[] args){
//         int height[]={1,1,4,2,1,3};
//         System.out.println(heightChecker(height));

//     }
// }

// class Stack14{
//     public static void main(String[] args) {
//         int [] a={5,7,9,12,15};
//         int [] b={3,8,13,17,19,25};
//         int [] ans=new int[a.length+b.length];
//         int k=0,j=0,i=0;
//     while(i<a.length && j<b.length){
//       if(a[i]>b[j]){
//           ans[k]=b[j];
//           j++;
//           k++;
//       }
//       else{
//           ans[k]=a[i];
//           i++;
//           k++;
//       }
//       while(i<a.length){
//           ans[k++]=a[i];
//           i++;
//       }
//       while(j<b.length){
//           ans[k++]=b[j];
//           j++;
//       }
//       for(i=0;i<ans.length;i++)
//       {
//       System.out.print(ans[i]+" ");
//       }
//   }
        
//     }
// }
// import java.util.*;
// class Stack14 {
//     public int[] findIntersectionValues(int[] nums1, int[] nums2) {  
//     ArrayList<Integer>list=new ArrayList<>();
//     for(int i=0;i<nums1.length;i++){
//         for(int j=0;j<nums2.length;j++){
//             if(nums1[i]==nums2[j]){
//               return int[] {nums1[i],nums2[j]};
                
//             }
//         }
//         return null;
//     }
    
// }
// }
import java.util.*;
class Stack14 {
    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args){
        int nums1[]={1,2,3,0,0,0};
        int m=3;
        int nums2[]={2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);
    }
}