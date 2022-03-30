
import java.util.*;


class DiagonalAddition{
	
	static int makeAddition(int[][] arr){
		
		System.out.println("printing matrix");
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length;j++){
				
			System.out.print(arr[i][j]+" ");
			
				
			}
			System.out.println();
			
			
			return sumdia(arr);
		
	}
	public static int sumdia(int[][] arr){
		
		    int dia1=0;
			for(int i=0,j=0;i<arr.length && j<arr.length;i++, j++){
				dia1=dia1+arr[i][j];
			}
			
			int dia2=0;
			for(int k=0,l=arr.length-1; k<arr.length && l>=0;k++, l--){
				dia2=dia2+arr[k][l];
			}
			int sol=dia1+dia2;
		 return	sol;
		
	}
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of row and col");
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		
		int[][] arr=new int[row][col];
		
		for(int i=0 ; i< row;i++){
			
			for(int j=0 ; j<col;j++){
				
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		
		
		int result=makeAddition(arr);
		System.out.print(result);
		
	}
}