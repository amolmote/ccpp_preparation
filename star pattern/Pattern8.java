

		/*
		
			      1 
				2 1 2 
			  3 2 1 2 3 
			4 3 2 1 2 3 4 
			  3 2 1 2 3 
				2 1 2 
				  1 
		*/		  
class Pattern8{
	
	
		public static void pattern(int n){
			
			for(int row =1;row<=2*n-1;row++){
				int totalColInRow = row >n ? 2*n-row : row;
				int totalSpaces = n-totalColInRow;
				
				for(int spaces = 1;spaces<=totalSpaces;spaces++){
					System.out.print("  ");
				}
				for(int col=totalColInRow;col>=1;col--){
					System.out.print(col+" ");
				}
				for(int col=2;col<=totalColInRow;col++){
					System.out.print(col+" ");
				}
				System.out.println();
			}
		}
		public static void main(String[] args){
		
			pattern(4);
			
		}
}