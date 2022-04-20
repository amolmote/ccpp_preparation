
/*
	
	Return true if the string "cat" and "dog" appear the same number of times in the given string.


	catDog("catdog") → true
	catDog("catcat") → false
	catDog("1cat1cadodog") → true
*/
class CountCatDog{
	
	/*
	three cases are remaining that is why i used other approch... ontains not gives the expected result
	public static boolean catDog(String str) {
  
	  int count1=0,count2=0;
	  
	  if(str.contains("cat")){
		count1++;
	  }
	  if( str.contains("dog")){
		count2++;
	  }
	  System.out.println(count1+" "+count2);
	  if(count1==count2)
		return true;
	  else
		return false;
	}
	*/
	public static boolean catDog(String str) {
  
	  int count1=0,count2=0;

  
   char[] ch=str.toCharArray();
	  
	  
	  for(int i=0;i<ch.length-2;i++){
  		if(ch[i]=='d' && ch[i+1]=='o' && ch[i+2]=='g'){
  		  count1++;
  		}
  		if(ch[i]=='c' && ch[i+1]=='a' && ch[i+2]=='t'){
  		  count2++;
  		}
	  }
		  if(count1==count2)
			return true;
		  else
			return false;
	}
	


	public static void main(String[] args){
		
		
		boolean result=catDog("dogdogcat");
		System.out.println(result);
		
	}
}