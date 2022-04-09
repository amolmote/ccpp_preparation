
/*
	  1 
    2 1 2 
  3 2 1 2 3 
4 3 2 1 2 3 4
*/

class Pattern7{
	
	public static void pattern(int n){
		
		for(int row = 1;row<=n;row++){
			int tatalColInRow= row;
			int totalSpaces = n-tatalColInRow;
			for(int spaces = 1;spaces<=totalSpaces;spaces++){
				System.out.print("  ");
				
			}
			for(int col=row ; col>=1 ;col--){
				System.out.print(col+" ");
			}
			
			for(int col=2;col<=row;col++){
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		
		pattern(4);
	}
}