


class DiplayMissingElements{

	public static void displayMissing(int[] arr){
		
		int j=0;
		
		for(int i=0;i<=20;i++){
			if(j<arr.length && i==arr[j]){
				j++;
			}
			else{
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args){
		
		int[] arr={1,3,6,7,8,13,17,20};
		
		displayMissing(arr);
	}

}