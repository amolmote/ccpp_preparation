

class mountainArrayPeekElement{

	
	public static int findingMountain(int[] arr){
		
		int start=0;
		int last=arr.length-1;
		
		
		
		while(start<last){
			int mid=start+(last-start)/2;
			if(arr[mid]>arr[mid+1]){
				
				last=mid;
			}
			else{
				start=mid+1;
			}
		}
	
		return start;
	}
	public static void main(String[] args){
	
		int[] arr={1,3,4,7,4,3,2,1};
		
		int peekElement=findingMountain(arr);
		
		System.out.println(peekElement);
		
		
	}
}