package ArrayList;
import java.util.ArrayList;

class Arraylist5 {
    // public static int storeWater(ArrayList<Integer>height){
    //     int maxWater=0;
    //     for(int i=0;i<height.size();i++){
    //         for(int j=0;j<height.size();j++){
    //             int ht=Math.min(height.get(i),height.get(j));
    //             int width=j-i;
    //             int currWater=ht*width;
    //             maxWater=Math.max(maxWater, currWater);

    //         }
    //     }
    //     return maxWater;
    // }
    
    public static int waterSave(ArrayList<Integer>heigth){
        int maxWater=0;
        int Lp=0;
        int Rp=heigth.size()-1;

        while (Lp < Rp) {
            int ht=Math.min(heigth.get(Lp), heigth.get(Rp));
            int width=Rp-Lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater, currWater);

            if(heigth.get(Lp) < heigth.get(Rp)){
                Lp++;
            }else{
                Rp++;
            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
       ArrayList<Integer>height=new ArrayList<>();
       height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(3);
       height.add(8);
       height.add(7);
       //System.out.println(storeWater(height));
     //  System.out.println(waterSave(height));
    }
}        
    

