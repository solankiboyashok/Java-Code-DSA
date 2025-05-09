package Arrays;

import java.util.Arrays;

class Sortbyparity{
    // public static int[] sortarraybyparity1(int nums[]){
    //           int l = 0;
    //           int r = nums.length - 1;
    //           while (l < r) {
    //             if (nums[l] % 2 == 1 && nums[r] % 2 == 0) {
    //               int temp = nums[l];
    //               nums[l] = nums[r];
    //               nums[r] = temp;
    //             }
    //             if (nums[l] % 2 == 0)
    //               ++l;
    //             if (nums[r] % 2 == 1)
    //               --r;
    //           }
          
    //          return nums;
    // }

    public static void sortarraybyparity(int nums[]){
        int evenpo=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[evenpo];
                nums[evenpo]=temp;
                evenpo++;
            }
        }
    }
    public static void print(int nums[]){
        for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){

    int nums[]={3,1,4,2};
    sortarraybyparity(nums);
    // sortarraybyparity1(nums);
    print(nums);
    
    }
}