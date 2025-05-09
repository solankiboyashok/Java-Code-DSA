package ArrayList;
import java.util.ArrayList;

public class Arrayslist10 {
    public static void main(String[] args){
    int target=5;
    ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==target){
                System.out.println(i);
            }else if(target>list.get(list.size()-1)){
                list.add(list.size(),target);
            }else if(list.get(i)<target && list.get(i+1)>target){
                list.add(i+1,target);
            }
            
        }
        System.out.println(list);
    }

}
