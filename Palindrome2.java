


class Palindrome2{

		public static int rev(int num){
			
			int digits = (int)Math.log10(num)+1;
			
			return helper(num,digits);
		}
		public static int helper(int num , int digits){
			if(num% 10 ==num){
				return num;
			}
			int rem=num%10;
			return rem * (int)(Math.pow(10,digits-1))+helper(num/10, digits-1);
			
		}
		public static boolean palindrome(int num){
			
			return num == rev(num);
		}
		public static void main(String[] args){
			int num =121;
			
			boolean flag = palindrome(num);
			
			System.out.println(flag);
		}
}