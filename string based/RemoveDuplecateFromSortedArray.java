
import java.util.*;


class RemoveDuplecateFromSortedArray{


	public static void removeDuplicate(int[] arr){
		
		//make change in original array itself
		int j=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];  //inserting last element 
		
		
		for(int i=0;i<j+1;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
		
		int[] arr={1,2,3,4,6,6,7,7,7};
		
		removeDuplicate(arr);
		
	}
}