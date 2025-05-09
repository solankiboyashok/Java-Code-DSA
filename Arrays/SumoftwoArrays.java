package Arrays;

import java.util.Scanner;

public class SumoftwoArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int arr1[]=new int[a];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        // int c=Math.max(n, a);
        // int[] array=new int[c];
        int array[]=new int[n>a?n:a];
        int c=0;
        
        int i=arr.length-1;
        int j=arr1.length-1;
        int k=array.length-1;
        while(k>=0){
            int d=c;
            
            if(i>=0){
                d+=arr[i];
            }
            if(j>=0){
                d+=arr1[j];
            }
            c = d / 10;
            d = d % 10;

            array[k] = d;

            i--;
            j--;
            k--;
            
        }
        if(c != 0){
            System.out.println(c);
        }
        for(int val:array){
            System.out.println(val);
        }
    }
}
