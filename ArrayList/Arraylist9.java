 package ArrayList;

// import java.util.ArrayList;

// public class Arraylist9 {
        
//     public static int waterSave(ArrayList<Integer>heigth){
//         int maxWater=Integer.MIN_VALUE;
//         int Lp=0;
//         int Rp=heigth.size()-1;

//         while (Lp < Rp) {
//             int ht=Math.min(heigth.get(Lp), heigth.get(Rp));
//             int width=Rp-Lp;
//             int currWater=ht*width;
//             maxWater=Math.max(maxWater, currWater);

//             if(heigth.get(Lp) < heigth.get(Rp)){
//                 Lp++;
//             }else{
//                 Rp--;
//             }
//         }
//         return maxWater;

//     }
//     public static void main(String[] args) {
//        ArrayList<Integer>height=new ArrayList<>();
//        height.add(1);
//        height.add(8);
//        height.add(6);
//        height.add(2);
//        height.add(5);
//        height.add(4);
//        height.add(8);
//        height.add(3);
//        height.add(7);
       
//        System.out.println(waterSave(height));
//     }
// }        
    

class Arraylist9 {
    public static int maxArea(int[]heigth){
        int maxWater=Integer.MIN_VALUE;
        int Lp=0;
        int Rp=heigth.length-1;
        while (Lp < Rp) {
            int ht=Math.min(heigth[Lp], heigth[Rp]);
            int width=Rp-Lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater, currWater);

            if(heigth[Lp] < heigth[Rp]){
                Lp++;
            }else{
                Rp--;
            }
        }
        return maxWater;

    }

    public static void main(String[] args) {
       
    int[] height={1,8,6,2,5,4,8,3,7};
       System.out.println(maxArea(height));
    }
}        
    





