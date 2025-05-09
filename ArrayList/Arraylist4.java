// package ArrayList;
// import java.util.ArrayList;
// public class Arraylist4 {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();

//         ArrayList<Integer>list1=new ArrayList<>();
//         list1.add(2);
//         list1.add(6);
//         mainList.add(list1);
        
//         ArrayList<Integer>list2=new ArrayList<>();
//         list2.add(4);
//         list2.add(7);
//         mainList.add(list2);

//         for(int i=0;i<mainList.size();i++){
//             ArrayList<Integer>currlist = mainList.get(i);
//             for(int j=0;j<mainList.size();j++){
//                 System.out.print(currlist.get(j)+" ");
            
//             }
//             System.out.println();
            
//         }
//         System.out.println(mainList);
//     }
// }


package ArrayList;

import java.util.ArrayList;
class Arraylist4 {
   public static void main(String[] args) {
    ArrayList<ArrayList<Integer>>MainList=new ArrayList<>();

    ArrayList<Integer>list1=new ArrayList<>();

    ArrayList<Integer>list2=new ArrayList<>();

    ArrayList<Integer>list3=new ArrayList<>();

    for(int i=1;i<=5;i++){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
    }
     MainList.add(list1);
     MainList.add(list2);
     MainList.add(list3);

     System.out.println(MainList);

     //looping 
     for(int i=0;i<MainList.size();i++){
        ArrayList<Integer>currList=MainList.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
     }
     
   }

    
}

