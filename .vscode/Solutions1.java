// class Solution {
//   public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
// int n1 = nums1.length;
// int n2 = nums2.length;
// int[] merged = new int[n1 + n2];

// int i = 0;
// int j = 0; 
// int k = 0; 

// while (i < n1 && j < n2) {

//   if (nums1[i] < nums2[j]) {
//     merged[k] = nums1[i];
//     i++; 
//   } else {
//     merged[k] = nums2[j];
//     j++; 
//   }
//   k++; 
// }

// while (i < n1) {
//   merged[k] = nums1[i];
//   i++;
//   k++;
// }
// while (j < n2) {
//   merged[k] = nums2[j];
//   j++;
//   k++;
// }
// int len=merged.length;
// double count=0;
// int ans=len/2;
// if(len%2==0){
//     count=(merged[ans-1]+merged[ans])/2.0;
// }
// else{
//     count=merged[ans];
// }
// return count;
//   }

//     public static void main(String[] args){
//       int nums1[]={1,3};
//       int nums2[]={0,0};
//       System.out.println(findMedianSortedArrays(nums1,nums2));

//     }

// }


class Solution1 {
  public static void sortArray(int[] nums) {
    int b[]=new int[nums.length];
  for(int i=0;i<nums.length;i++){
    if(nums[i]>nums[i+1]){
      int temp=nums[i];
      nums[i]=nums[i+1];
      nums[i+1]=temp;
    System.out.println(b[i]);
    }
  }
  }
  public static void main(String[] args){
  int nums[]={5,2,3,1};
  sortArray(nums);
  }
  
}