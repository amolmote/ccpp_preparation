
import java.util.*;


class MergeSort{
	
	public static int[] mergeSort(int[] arr){
		
		if(arr.length==1){
			return arr;
		}
		int start=0,end=arr.length;
		int mid=start+(end-start)/2;
		
		int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
		int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
		
		return merge(left,right);
		
		
	}

	
	public static int[] merge(int[] left,int[] right){
		int[] mix=new int[left.length+right.length];
		
		int i=0,j=0,k=0;
		
		while(i<left.length && j<right.length){
			if(left[i]<right[j]){
				mix[k]=left[i];
				i++;
			}
			else{
				mix[k]=right[j];
				j++;
			}
			k++;
		}
		
		//now it is possible that one of the array is going to end first so copy remaining element of arrat
		// as it is
		while(i<left.length){
			mix[k]=left[i];
			i++;
			k++;
			
		}
		while(j<right.length){
			mix[k]=right[j];
			j++;
			k++;
		}
		return mix;
	}
	public static void main(String[] args){
		
		int[] arr={2,1,4,3,7,4,7,9};
		
		int[] arr1=mergeSort(arr);
		
		System.out.println(Arrays.toString(arr1));
		
		
	
	}
}