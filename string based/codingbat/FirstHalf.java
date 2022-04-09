

class FirstHalf{

	public static String firstHalf(String str){
		
		return str.substring(0,str.length()/2);
	}
	public static void main(String[] args){
		
		String result=firstHalf("HelloHello");
		System.out.println(result);
		
	}
}