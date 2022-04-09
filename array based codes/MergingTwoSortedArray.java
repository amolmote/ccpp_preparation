

import java.util.*;

class MergingTwoSortedArray{

	public static int[] merger(int[] arr1,int[] arr2){
		int[] mix=new int[arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				mix[k]=arr1[i];
				i++;
			}
			else{
				mix[k]=arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<arr1.length){
			mix[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length){
			mix[k]=arr2[j];
			k++;
			j++;
		}
		
		return mix;
		
	}
	public static void main(String[] args){
		
		int[] arr1={1,3,6,7,9};
		int[] arr2={2,4,8};
		
		int[] result=merger(arr1,arr2);
		
		System.out.println(Arrays.toString(result));
	}
}