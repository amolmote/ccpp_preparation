

	/*
		   *
		  * *
		 * * *
		* * * *
		 * * *
		  * *
		   *
	*/
class Pattern6{

		public static void pattern(int n){
			
			//outer loop till row = 7
			for(int row = 1;row<=2*n-1 ; row++){
				int totalColInRow = row > n ? 2*n-row : row;
				int totalSpaces = n-totalColInRow;
				for(int spaces =1;spaces<=totalSpaces;spaces++){
					System.out.print(" ");
					
				}
				for(int col=1;col<=totalColInRow;col++){
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		public static void main(String[] args){
			
				pattern(4);
		}
}