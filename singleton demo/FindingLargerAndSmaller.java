



class FindingLargerAndSmaller{


		public static void findingLargerAndSmaller(int[] arr){
				
				int larger = arr[0];
				int smaller = arr[0];
				
				for(int i=0;i<arr.length;i++){
					
					if(arr[i]>larger){
						
						larger=arr[i];
					}
					if(arr[i]<smaller){
						
						smaller = arr[i];
						
					}
					
					
				}
				
				System.out.println("smaller element is = "+ smaller +" and larger is " +larger);
				
			
		}
		public static void main(String[] args){
			
			int[] arr={2,44,3,1,9};
			
			findingLargerAndSmaller(arr);
			
		}
}