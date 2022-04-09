
import java.util.*;

class InsertingSymbolsInSpace{
	
	public static void insertingSymbols(char[] ch){
			char[] result=new char[100];
			int j=0;
			for(char i:ch){
				
				if(i==' '){
					result[j]='#';
					j++;
				}
				else{
					result[j]=i;
					j++;
				}
				
			}
		System.out.println(Arrays.toString(result));
	}
	public static void main(String[] args){
		
		String str="java made so easy";
		
		char[] ch = str.toCharArray();
		
	     insertingSymbols(ch);
		
		
		
		
	}
}