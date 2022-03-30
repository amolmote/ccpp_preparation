

		/*
			perfect number
			6= 1+2+3
			28= 1+2+4+7+14
			496= 1+2+4+8+16+31+62+124+248
		*/
class PerfectNumberOrNot{



	public static boolean isPerfectOrNot(int num){
		
		int sumOfDivisors=1;
		
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				sumOfDivisors+=i;
			}
		}
		System.out.println(sumOfDivisors);
		if(sumOfDivisors==num){
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args){
		int num=28;
		
		boolean flag=isPerfectOrNot(num);
		
		System.out.println(flag);
		
	}
	
	
}