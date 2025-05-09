package Arrays;

public class Storewater {
       // Complexity =O(n)
        public static int storeWater(int height[]){
            int maxWater=Integer.MIN_VALUE;
            int Lp=0;
            int Rp=height.length-1;
            while (Lp < Rp) {
                int ht=Math.min(height[Lp], height[Rp]);
                int width=Rp-Lp;
                int currWater=ht*width;
                maxWater=Math.max(maxWater, currWater);
                if(height[Lp] < height[Rp]){
                    Lp++;
                }else{
                    Rp--;
                }
            }
            return maxWater;
    }
    public static void main(String[] args){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(storeWater(height));
    }   
}
