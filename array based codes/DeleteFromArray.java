

	import java.util.*;
	
class DeleteFromArray{

	
	public static int deleteFromArray(int[] arr, int del){
	
		int count=0;
		for(int i=0;i<arr.length;i++){
			
			arr[i]=arr[i];
			
			if(del==arr[i] ){
				
				for(int j=i;j<arr.length-1;j++){
					
					
						arr[j]=arr[j+1];
						
					
				}
				count+=1;
				break;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		return count;
	}
	public static void main(String[] args){
		
		int[] arr={1,2,3,4,6,7,8};
		
		int del=4;
		
		int count=deleteFromArray(arr,del);
		System.out.println(count);
		
		
	}
}