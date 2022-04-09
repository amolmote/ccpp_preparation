


/*
	Return the number of times that the string "hi" appears anywhere in the given string.


	countHi("abc hi ho") → 1
	countHi("ABChi hi") → 2
	countHi("hihi") → 2
*/
class CountHi{
	
	
	public static int countHi(String str) {
  
	  char[] ch=str.toCharArray();
	  
	  //HashMap<Character,Integer> hm=new HashMap<>();
	  
	  int count=0;
	  for(int i=0;i<ch.length-1;i++){
		if(ch[i]=='h' && ch[i+1]=='i'){
		  count++;
		}
	  }
	  return count;
	}

	public static void main(String[] args){
		
		
		int result=countHi("ABChi hi");
		System.out.println(result);
		
	}
}