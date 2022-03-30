
import java.util.*;


class StringReverse{

		//we can optimizing the complexity by avoiding to creating new array

		public static char[] reverse(String str){
		
			char[] ch=str.toCharArray();
			 
			 char[] tmp=new char[ch.length];
			 
			 int j=0;
			 
			for(int i=ch.length-1;i>=0;i--){
				tmp[j]=ch[i];
				j++;
			}
		
		
			return tmp;
		}
	public static void main(String[] args){
		
			String str="amol";
			
			char[] temp= reverse(str);
			//System.out.println(Arrays.toString(temp));
			
			String str1 = new String(temp);
			
			//printing reversed string
			
			System.out.println(str1);
			
			
	}
		
}