

class WithOutFirstAndEnd{
	
	
	public static String withOutFirstAndEnd(String str){
		
		return str.substring(1,str.length()-1);
	}
	public static void main(String[] args){
		
		String result=withOutFirstAndEnd("HelloHello");
		System.out.println(result);
		
	}
}