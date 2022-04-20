


class DisplayMissingElement{

	public static void displayMissing(int[] arr){
		
		int j=0;
		for(int i=0;i<=12;i++){
			
			if(j<arr.length && i==arr[j]){
				j++;
			}
			else{
				System.out.print(i+" ");
				
			}
		}
	}
	public static void main(String[] args){
		
		int[] arr={1,2,4,6,7,8,12};
		
		displayMissing(arr);
		
	}
}