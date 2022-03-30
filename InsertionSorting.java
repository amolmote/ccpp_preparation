

import java.util.*;

class InsertionSorting{

	public static void sort(int[] arr){
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(arr[j]<arr[j-1]){  //12(j-1) 3(j) 
					swap(arr,j,j-1);
				}
				else{
					break;
					//already sorted
				}
			}
		}
	}
	public static void swap(int[] arr,int first, int second){
		
		int temp= arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
	}
	public static void main(String[] args){
	
		int[] arr={2,3,1,6,4};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}