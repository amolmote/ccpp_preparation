

class FibonacciSeries{

		//num1=0 && num2=1  num3=num1+num2  0 1 1
		
		public static int fibSeries(int num){
				
				if(num<2){
					return num;
				}
				
			
				return fibSeries(num-1)+fibSeries(num-2);
				
		}
		
		public static void main(String[] args){
		
		    int num=40;
		
			System.out.println(fibSeries(num));
			
		}


}