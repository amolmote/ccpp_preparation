


	/*
		to finds "index" in array such that - sum of elements on whose 
		left is equal to sum of elements on right in java
	*/


class FindingSumOfIndexInArray{
	
	

	public static int findingIndexOfSum(int[] arr){
		int leftIndex = 0, rightIndex = arr.length-1;
		int leftSum=0, rightSum=0;
		
		while(leftIndex<=rightIndex){
			if(leftSum>rightSum){
				rightSum=rightSum+arr[rightIndex--];
			}
			else{
				leftIndex=leftIndex+arr[leftIndex++];
			}
		}
		if(leftSum==rightSum){
			return rightIndex;
		}
		else
		return -1;
		
	}
	public static void main(String[] args){
	
		int[] arr={2,1,1,4};
		
		for(int i : arr){
			System.out.print(i+" ");
			
		}
		int findIndex = findingIndexOfSum(arr);
		System.out.println(findIndex);
		//System.out.println(findIndex!=-1? "sum of element on left from 0 to "+findIndex+" sum of element from
		//           " +(findIndex+1)+"to" + (arr.length-1) : "no such index found");
	}
}