

class OccuranceOfDigitInCube{


		
		public static int occuranceOfNum(long num, int occuranceOf){
		
				int count=0;
				long cube=num*num*num;
				
				while(cube>0){
					if(cube%10==occuranceOf){
						count++;
					}
					num=num/10;
				}
		
				return count;
				
		}
		
	public static void main(String[] args){
	
	  long num=12;
	  int occuranceOf=1;
	  
	  int counting = occuranceOfNum(num,occuranceOf);
	  
	  System.out.println(counting);
	  
	  
		
	}
		
}