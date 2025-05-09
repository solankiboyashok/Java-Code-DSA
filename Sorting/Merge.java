package Sorting;

public class Merge {
    
static void merge(int Arr[], int start, int mid, int end) {
	int temp[] = new int[end - start + 1];
	int i = start, j = mid+1, k = 0;
	while(i <= mid && j <= end) {
		if(Arr[i] <= Arr[j]) {
			temp[k] = Arr[i];
			k += 1; i += 1;
		}
		else {
			temp[k] = Arr[j];
			k += 1; j += 1;
		}
	}
	while(i <= mid) {
		temp[k] = Arr[i];
		k += 1; i += 1;
	}

	while(j <= end) {
		temp[k] = Arr[j];
		k += 1; j += 1;
	}

	
	for(i = start; i <= end; i += 1) {
		Arr[i] = temp[i - start];
	}
}
static void mergeSort(int Arr[], int start, int end) {

	if(start < end) {
		int mid = (start + end) / 2;
		mergeSort(Arr, start, mid);
		mergeSort(Arr, mid+1, end);
		merge(Arr, start, mid, end);
	}
}
  static void print(int Arr[]){
    for(int i=0;i<Arr.length;i++){
        System.out.print(Arr[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args){
   int Arr[]={6,3,7,2,8,4,9,1};
   mergeSort(Arr,0,Arr.length-1);
   print(Arr);
}
}
