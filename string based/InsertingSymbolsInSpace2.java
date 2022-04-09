
			
import java.util.*;
	
			
class InsertingSymbolsInSpace2{
	
	public static String insertingSymbols(char[] ch){
			char[] result=new char[100];
			int j=0;
			for(int i=0;i<ch.length;i++){
				
				if(ch[i]==' '){
					result[j]='#';
					j++;
					result[j]='$';
					j++;
					result[j]='#';
					j++;
					
				}
				else{
					result[j]=ch[i];
					j++;
				}
			}
		//System.out.println(Arrays.toString(result));
		String str1=new String(result);
		return str1;
		
	}
	public static void main(String[] args){
		
		String str="java made so easy";
		
		char[] ch = str.toCharArray();
		
	     String result=insertingSymbols(ch);
		
		System.out.println(result);
		
		
	}
}