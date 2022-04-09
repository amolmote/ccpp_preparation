

/*
	public static void main(String[] args){
		
	}

*/
/*
	@Auther Amol Mote
	exp.<<Yay>>
*/
class MakeoutWord{

	public static String makeOutWord(String str1,String str2){
		
		String str=str1.substring(0,2)+str2+str1.substring(2,4);
		return str;
	}
	public static void main(String[] args){
		
		String result=makeOutWord("<<>>", "Yay");
		System.out.println(result);
		
	}
}