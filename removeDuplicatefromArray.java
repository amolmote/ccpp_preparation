
import java.util.*;

//for sorted array
class removeDuplicatefromArray{


		//as per space complexity do not create extra array optimize solution is make change in same array
		public static void removeDuplicate(int[] arr){
			
			int[] temp=new int[arr.length];
			
			int j=0;
			for(int i=0;i<arr.length-1;i++){
				if(arr[i]!=arr[i+1]){
					
					temp[j]=arr[i];
					j++;
				}
			
			}
			//last element required to insert manually
			temp[j]=arr[arr.length-1];
			
			System.out.println(Arrays.toString(temp));
			
		}
	public static void main(String[] args){
	
		int[] arr={1,2,2,3,4,4,6,7,7};
		
		removeDuplicate(arr);
		
	}
		
}