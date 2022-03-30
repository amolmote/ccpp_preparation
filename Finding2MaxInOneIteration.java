


/*
	Find two maximum numbers in array in one iteration in java
*/
//very very important
class Finding2MaxInOneIteration{

	public static void twoMaxElement(int[] arr){
		
		int max1=0,max2=0;
		
		for(int i=0;i<arr.length;i++){
			if(max1<arr[i]){
				max2=max1;
				max1=arr[i];
			}
			else if(max2<arr[i]){
				max2=arr[i];
			}
		}
		System.out.println(max1+" "+max2);
		
		
	}
	public static void main(String[] args){
			
			int[] arr={22,33,21,44,33,90,33};
			
			
			twoMaxElement(arr);
	}
}