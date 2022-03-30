
import java.util.*;

class removeDuplicatefromArray2{
	
	//as per space complexity do not create extra array optimize solution is make change in same array
	//just replacing temp with original array and make change in original array
	
		public static void removeDuplicate(int[] arr){
		
			
			int j=0;
			for(int i=0;i<arr.length-1;i++){
				if(arr[i]!=arr[i+1]){
					
					arr[j]=arr[i];
					j++;
				}
			
			}
			
			//last element required to insert manually
			arr[j]=arr[arr.length-1];
			
			for(int i=0;i<j+1;i++){
				System.out.print(arr[i]+" ");
			}
			
			//System.out.println(Arrays.toString(arr));
			
		}
	public static void main(String[] args){
	
		int[] arr={1,2,3,4,4,6,6,6};
		
		removeDuplicate(arr);
		
	}

}