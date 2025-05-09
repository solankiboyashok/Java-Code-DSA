
import java.util.*;
class IMP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxStock=10;
        if(n>maxStock){
            n=maxStock;
        }
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        int target=sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println("Eyeglass with ID "+arr[i]+" added to the showroom.");
        }
        boolean found=false;
        for(int i=0;i<10;i++){
            if(arr[i]==target){
                found=true;
                arr[i]=-1;
                System.out.println("Eyeglass with Id "+target+" sold.");
                break;
            }else{
                System.out.println("Invalid eyeglass Id");
                break;
            }
        }
        if(!found){
            System.out.println("Exception caught. Error: Eyeglass out of stock.");
        }
    }
}