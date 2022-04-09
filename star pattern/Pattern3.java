

		/*
		
			* * * *
			* * *
			* *
			*
		*/
class Pattern3{

		
		public static void pattern(int n){
			
			for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {		4-1+1 = 3+1=4 : 4-2+1 = 2+1 = 3
                System.out.print("* ");
            }
            System.out.println();
        }
			
		}
		public static void main(String[] args){
		
			pattern(4);
		}

}