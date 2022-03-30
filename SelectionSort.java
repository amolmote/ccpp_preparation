
import java.util.*;

class SelectionSort{

		public static void selectionSort(int[] arr){
			
			for(int i=0;i<arr.length;i++){
				
				int last = arr.length-1-i;
				int maxIndex=getMaxIndex(arr,0,last);
				//swap with the last index 
				swap(arr,maxIndex,last);
			}
			
		}
		
		public static int getMaxIndex(int[] arr,int start,int end){
			int max=start;
			for(int i=start;i<=end;i++){
				if(arr[max]<arr[i]){
					max=i;
				}
			}
			return max;
		
		}
		
		public static void swap(int[] arr,int first,int second){
				int temp=arr[first];
				arr[first]=arr[second];
				arr[second]=temp;
		}
		public static void main(String[] args){
			
			int[] arr={22,11,33,2,31,12};
			
			selectionSort(arr);
			
			System.out.println(Arrays.toString(arr));
			
		
		}
}