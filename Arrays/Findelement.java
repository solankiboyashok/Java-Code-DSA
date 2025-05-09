package Arrays;

import java.util.Scanner;

public class Findelement {
    public static void findelement(int arr[],int key){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
               idx=i;
               break;
            }
        }
        System.out.println(idx);
    }
    public static void main(String[] args){
    //  int arr[]={4,55,34,23,66};
    //  int key=23;
    //  findelement(arr, key);
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int key=sc.nextInt();
    findelement(arr, key);
    }
    
}
