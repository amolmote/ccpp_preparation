
import java.util.*;


class BubbleSort{
		/*
		public static void swap(int first, int second){
			int temp=first;
			first=second;
			second=temp;
		}
		*/
		public static int[] sort(int[] arr){
			
			for(int i=0;i<arr.length;i++){
				
				for(int j=0;j<arr.length-1-i;j++){
					if(arr[j]>arr[j+1]){
						int temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
					}
				}
			}
			return arr;
		}
		public static void main(String[] args){
		
			int[] arr={41,22,4,1,2};
			
			int[] arr1=sort(arr);
			
			System.out.println(Arrays.toString(arr1));
		}
}