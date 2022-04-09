
		/*
			1	*
			2	* *
			3	* * *	
			4	* * * *
			5	* * *		2*n-row = 8-5 = 3
			6	* *			2*n-row = 8-6 = 2
			7	*			2*n-row = 8-7 = 1
		*/
class Pattern4{

		
		public static void pattern(int n){
			
			for(int row = 1;row<=2*n-1;row++){
				int totalColInRow = row > n ? 2*n-row: row ;
				for(int col =1;col<=totalColInRow;col++){
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		public static void main(String[] args){
		
			pattern(4);
		}

}