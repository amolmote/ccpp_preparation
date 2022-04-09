


class ExtraEnd{

	public static String extraEnd(String str){
		
		String str1=str.substring(str.length()-2,str.length());
		return str1+str1+str1;
	}
	public static void main(String[] args){
		
		String str="hello";
		
		String result=extraEnd(str);
		
		System.out.println(result);
	}
}