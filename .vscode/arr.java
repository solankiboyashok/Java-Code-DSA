// import java.util.Arrays;

// // complexity-O(n^2)
// class arr{
//   public static  int major(int nums[]){
//     int n=nums.length;
//     int count=0;
//     for(int i=0;i<nums.length;i++){
//         for(int j=0;j<nums.length;j++){
//             if(nums[i]==nums[j]){
//                 count++;
//             }
//         }
//         if(count>n/2){
//             return nums[i];
//         }
//     }
//     return -1;

    
//   }


//Moore's vosting algorithm
//complexity-O(n)
// public static int major(int nums[]){
//     int val=nums[0];
//     int count=1;
//     for(int i=1;i<nums.length;i++){
//         if(val==nums[i]){
//             count++;
//         }else if(count==0){
//             val=nums[i];
//             count=1;
//         }else{
//             count--;
//         }
//     }
//     int ans=0;
//     int n=nums.length;
//     for(int i=0;i<nums.length;i++){
//         if(nums[i]==val){
//             ans++;
//         }
//         if(ans>n/2){
//             return val;
//         }
//     }
//     return -1;
// }
// public static void main(String[] args) {
//  int nums[]={2,2,1,1,3,1,2};
//  System.out.println(major(nums));
// }
// }
class arr{
 public static void main(String[] args){
    int a[]={3,42,1,4,5};
    int b=Integer.MAX_VALUE;
    System.out.println(b);
 }
}