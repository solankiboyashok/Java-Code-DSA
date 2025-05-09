 package Arrays;

// import java.util.Scanner;

// public class Even {
//     public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//     //     int count=0;
//     //     for(int i=1;i<=a;i++){
//     //         if(a%i==0 ){
//     //             count++;
//     //         }

//     //     }
//     //     if(count%2==0){
//     //         System.out.print("even");
//     //     }else{
//     //         System.out.print("odd");
//     //     }
    
//     // double m=Math.sqrt(n);
//     // if(m*m==n){
//     //     System.out.println("odd");
//     // }else{
//     //     System.out.println("even");
//     // }
//     int count=0;
//     double m=Math.sqrt(n);
//     for(int i=1;i<=n;i++){
//      if(n%i==0 ){
//          count++;
//      }
//     }
//     if(m==count){
//         System.out.println(true);
//     }else{
//         System.out.println(false);
//     }
// }
// }

public class P {
    // public static boolean isPrime(int n, int divisor) {
    //     if (n <= 1) {
    //         return false;
    //     }
    //     if (divisor == 1) {
    //         return true;
    //     }
    //     if (n % divisor == 0) {
    //         return false;
    //     }
    //     return isPrime(n, divisor - 1);
    // }

    // public static boolean isPrime(int n) {
    //     return isPrime(n, n - 1);
    // }

    // public static void main(String[] args) {
    //     int number = 29;
    //     if (isPrime(number)) {
    //         System.out.println(number + " is a prime number.");
    //     } else {
    //         System.out.println(number + " is not a prime number.");
    //     }
    // }



   static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printl(){
        int n=25;
        int p=(int)Math.sqrt(n);
        if(p*p==n && isPrime(n)){
            System.out.println("3 factor");
        }else{
            System.out.println("Not 3 factor");
        }
    }
    public static void main(String[] args){
        int n=17;
        printl();
    }
}


