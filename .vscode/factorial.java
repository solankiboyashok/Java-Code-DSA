
public class factorial {

    // public static int power(int n,int x){
    //   if(x==0){
    //     return 1;
    //   }
    //   int smalloutput=power(n, x-1);
    //   int ans1=n*smalloutput;
    //   return ans1;
    // }
    // public static void main(String[] args){
    //   System.out.println(power(3,4));
    // }

    // public static int findDigit(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     //recursive
    //     int s=findDigit(n/10);
    //     int ans=1+s;
    //     return ans;
    //     //int count =0;
    //     // while (n!= 0) {
        
    //     //     n/= 10;
    //     //     count++;
    //     //   }
    //      // return count;
      
    // }public static void main(String[] args) {
    //     int n=1234;
    //     System.out.println(findDigit(n));
    // }
    
    // public static void naturalnumber(int n){
    //     if(n==0){
    //         return;
    //     }

    //     naturalnumber(n-1);
    //     System.out.print(n);
        
    // }
    //     public static void main(String[] args){
    //         naturalnumber(5);
    //     }
    
    public static int sumof(int arr[],int n){
       if(n<=0){
        return 0;
       }

        return sumof(arr, n-1)+arr[n-1];
       
    }
    public static void main(String[] args){
        int arr[]={5,7,9,6};
        int n=arr.length;
        System.out.println(sumof(arr, n));
    }

}
