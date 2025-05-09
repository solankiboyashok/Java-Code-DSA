package ArrayList;
import java.util.ArrayList;

public class Arrayslist11 {
  
        public static boolean isMonotonic(ArrayList<Integer> nums) {
            boolean inc =true;
            boolean dec=true;
            for(int i=0;i<nums.size()-1;i++){
                inc &=nums.get(i) <=nums.get(i+1);
                dec &=nums.get(i)>=nums.get(i+1);    
            }
            return inc||dec;
        }
    
    public static void main(String[] args){
     ArrayList<Integer>nums=new ArrayList<>();
     nums.add(1);
     nums.add(3);
     nums.add(2);
     boolean a=isMonotonic(nums);
     System.out.println(a);

    }
}
