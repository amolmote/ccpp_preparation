

class DoubleChar{
	
	
	public static String doubleChar(String str) {
		  
		  char[] ch=str.toCharArray();
		  
		  char[] temp=new char[ch.length*2];
		  
		  int j=0;
			  for(char i: ch ){
				temp[j]=i;
				j++;
				temp[j]=i;
				j++;
			  }
		  
		  String str1=new String(temp);
		  return str1;
  
  
}
	public static void main(String[] args){
		
		
		String result=doubleChar("amol");
		System.out.println(result);
		
	}
}