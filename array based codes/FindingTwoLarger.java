
class FindingTwoLarger{

	public static void findingTwoLarger(int[] arr){
		
			int max1=arr[0];
			int max2=arr[0];
			
			for(int i=0;i<arr.length;i++){
				
				if(arr[i]>max1){
					max2=max1;
					max1=arr[i];
				}
				else{
					max2=arr[i];
				}
			}
			System.out.println(max1+" "+max2);
			
		
	}
	public static void main(String[] args){
		
		int[] arr={1,2,3,30,6,7,8};
		
		findingTwoLarger(arr);
		
		
	}
}