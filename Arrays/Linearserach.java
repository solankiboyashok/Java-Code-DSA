package Arrays;
//time complexity is O(n)
//Space complexity is O(1) 
public class Linearserach {
    public static int linearserach(int arr[],int key){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
              return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={12,33,43,55,66,7,4,2};
        int key=3;
        int index=linearserach(arr, key);
        if(index==-1){
            System.out.println("index not found");
        }else{
            System.out.println("index found at:"+index);
        }
    }
}
