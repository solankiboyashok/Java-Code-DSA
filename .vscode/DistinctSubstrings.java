
// //complexity : O(n)
// // public class Sum2 {
// //     public static void sum(int arr[], int target){
// //         for(int i=0;i<arr.length;i++){
// //             for(int j=i+1;j<arr.length;j++){
// //                 if(arr[i]+arr[j]==target){
// //                     System.out.println("{"+i+","+j+"}");
// //                 }
// //             }
// //         }
// //     }
// //     public static void main(String[] args){
// //         int arr[]={3,7,2,5,8,10};
// //         int target=13;
// //         sum(arr, target);
// //     } 
// // }

// import java.util.HashMap;

// public class Sum2{
//     public static int [] hashmap(int arr[], int target){
//         HashMap<Integer,Integer>map=new HashMap<>();
//         int ans[]=new int[2];
//         for(int i=0;i<arr.length;i++){
//         if(map.containsKey(target-arr[i])){
//             ans[0]=i;
//             ans[1]=map.get(target-arr[i]);
//            break;
//         }
//         map.put(arr[i],i);
//         }
//         return ans;   
//     }
//     public static void main(String[] args){
//         int arr[]={3,7,2,5,8,10};
//         int target=13;
//         int[] result = hashmap(arr, target);
//         if (result[0] != 0 && result[1] != 0) {
//             System.out.println("Pair found: [" + result[0] + ", " + result[1] + "]");
//         } else {
//             System.out.println("No pair found.");
//         }
//     }
// }
import java.util.HashSet; 
 
public class DistinctSubstrings { 
    public static int countDistinctSubstrings(String s) {
     HashSet<String> set = new HashSet<>(); int n = s.length(); 
       for (int i = 0; i < n; i++) {
           for (int j = i + 1; j <= n; j++) { 
             set.add(s.substring(i, j)); 
            } 
        } 
      return set.size(); 
    } 
 
    public static void main(String[] args) { 
       String str = "abcde"; 
       System.out.println("Distinct substrings in '" + str + "': " + countDistinctSubstrings(str)); 
    } 
} 
