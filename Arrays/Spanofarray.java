package Arrays;

import java.util.Scanner;

public class Spanofarray {
    public static int span(int arr[]){
     int max=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
     }
     for(int j=0;j<arr.length;j++){
        if(arr[j]<min){
            min=arr[j];
        }
     }
     int a=max-min;
     return a;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of arr : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("span of Array : ");
        System.out.print(span(arr));
    }
}
