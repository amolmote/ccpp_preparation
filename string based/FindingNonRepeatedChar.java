

import java.util.*;

//return the non repeated char or print directly
class FindingNonRepeatedChar{


	public static void nonRepeatedChar(char[] ch){
	
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(char i : ch){
			
			if(hm.containsKey(i)){
				//either use this condition or direcctly hm.get()!=null that means map already has an element
				//then increated count of it
				hm.put(i,hm.get(i)+1);
			}
			else{
				hm.put(i,1);
			}
			
		}
		Iterator<Character> itr=hm.keySet().iterator();
		while(itr.hasNext()){
			char temp=itr.next();
			if(hm.get(temp)<=1){
				System.out.println("the non_repeated char is:- "+temp+" and the count is " +hm.get(temp));
//imp				//break;    //this is only when u want to return a first non repeated character
				
			}
		}
	}
	public static void main(String[] args){
		
		String str="sjsajdsadlkasd";
		
		char[] ch=str.toCharArray();				
		
		nonRepeatedChar(ch);
		
	}
}