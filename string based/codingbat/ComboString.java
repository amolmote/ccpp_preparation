
/*
	the which having max length put inside the other string
*/
class ComboString{
	
	
	public static String comboString(String str1,String str2){
		
		if(str1.length()>str2.length()){
			return str2+str1+str2;
		}
		else
			return str1+str2+str1;
	}
	public static void main(String[] args){
		
		//String result=comboString("Hello","hi");
		String result=comboString("Hi","hello");
		System.out.println(result);
		
	}
}