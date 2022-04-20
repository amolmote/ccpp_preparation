


class DiagonalSumSub{

	
	public static void main(String[] args){
		
		int[][] arr={{1,2,3},{3,4,6},{6,7,8}};
		
		int leftDiaSum=0;
		int rightDiaSum=0;
		
		
		for(int i=0;i<arr.length;i++){
			
			leftDiaSum +=arr[i][i];  //bcz row and col is same here
			rightDiaSum+=arr[i][arr.length-1-i];
			
			
		}
		System.out.println(Math.abs(leftDiaSum-rightDiaSum));//(1+4+8)-(3+4+6)=13-13=0
		
	}
}