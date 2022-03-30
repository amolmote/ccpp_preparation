

class IsBinaryNumberOrNot{


		public static boolean isBinaryOrNot(long num){
			
			while(num!=0){
				if(num%10>1){
					return false;
				}
				num=num/10;
			}
			
			return true;
			
		}
				
			
		public static void main(String[] args){
		
				long num=11000001000l;
				
				boolean flag= isBinaryOrNot(num);
				System.out.println(flag);
				
				
		}
}