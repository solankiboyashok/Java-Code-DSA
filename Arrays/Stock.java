package Arrays;

public class Stock {
    public static int Stockbuyandsell(int arr[]){
        int n=arr.length;
        int Buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(Buyprice<arr[i]){
              int profit=arr[i]-Buyprice;
             maxprofit=Math.max(maxprofit,profit);
            }else{
                Buyprice=arr[i];
               }
        }
            return maxprofit;
           
        }
    
    public static void main(String[] args){
     int arr[]={7,1,5,3,6,4};
     System.out.println(Stockbuyandsell(arr));
    }
}