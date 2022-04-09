

class Palindrome{


	public static int rev(int num){
		
		//counting the number of digits by using Math.log10
		//also sometime u req to declare some addition  varialble then make another method
		
		int digits = (int)Math.log10(num)+1; //it gives number of digits
		
		return helper(num,digits);
		
		
	}
	
		public static int helper(int num, int digits){
			
			if(num%10==num){		//if single digit number given then palindrome the number itself
				return num;
			}
			
			int rem = num%10;
			return rem * (int)(Math.pow(10,digits-1)) +helper(num/10,digits-1);
			/*
				1*100+helper(12,2)=100
				2*10+helper(1,1)=20
				1*1+return num=1
				total = 121
			*/
		}
	
	
	public static boolean isPalinfrome(int num){
		
		return num==rev(num);
	}

	public static void main(String[] args){
	
		
		boolean flag=isPalinfrome(121);
	
		System.out.println(flag);
	
		
	}
}