package Arrays;

public class Subarray {
    public static void subarray(int arrr[]){
         int n=arrr.length;      
        for(int i=0;i<n;i++){
          int start=i;
          for(int j=0;j<n;j++){
            int end=j;
            for(int k=start;k<end;k++){
                System.out.print(arrr[k]+" ");
            }
            System.out.println();
          }
          System.out.println();
      }
    }
    public static void main(String[] args){
        int arrr[]={2,3,4,5,2,4};
        subarray(arrr);
    }
}
