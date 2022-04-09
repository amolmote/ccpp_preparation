

	/*
		   *
		  * *
		 * * *
		* * * *
	
	*/
class Pattern5{
	
	
	public static void pattern(int n){
		
		for(int row =1;row<=n;row++){   						//2*n-1 for diamond shapes 
			int totalColInRow = row > n ? 2*n-row :row;
			int tatalSpaces =n-totalColInRow;
			for(int spaces = 1 ;spaces <= tatalSpaces;spaces++){
				System.out.print(" ");
				
			}
			
			for(int col =1 ; col<=totalColInRow;col++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		
		pattern(4);
	}

		
}