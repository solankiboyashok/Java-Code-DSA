import java.util.*;
class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int Dp[]=new int[nums.length];
         Dp[0]=nums[0];
         Dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
         Dp[i]=Math.max(Dp[i-2]+nums[i],Dp[i-1]);
        }
        return Dp[nums.length-1];
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int size=sc.nextInt();
         int nums[]=new int[size];
         for(int i=0;i<size;i++){
             nums[i]=sc.nextInt();
            
         }
         Solution m=new Solution();
        // int nums[]={1,2,3,1};
        System.out.println(m.rob(nums));
    }
  
}