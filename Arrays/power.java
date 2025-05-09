package Arrays;

public class power {
         //complexity=O(n)
        // public static boolean isPowerOfTwo(int n) {
        //     int a=2;
        //     for(int i=0;i<31;i++){
        //         double b=Math.pow(a,i);
        //         if(b==n){
        //             return true;
        //         }
        //     }
        //     return false;
        // }

        //complexity=O(1)
        public static boolean isPowerOfTwo(int n){
            return n>0 && (n&n-1)==0;
        }

        public static void main(String[] args){
            int n=1;
        System.out.println(isPowerOfTwo(n));
            
    }
}
