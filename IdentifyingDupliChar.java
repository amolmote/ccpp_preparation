
import java.util.*;


class IdentifyingDupliChar{

	public static void findingDupliChar(char[] ch){
			
		HashMap<Character, Integer> hm=new HashMap<>();

		
			
			for(char c : ch){
					//hm.put(c,1);
					if(hm.get(c)!=null){
						hm.put(c , hm.get(c)+1);
					}
					else{
						hm.put(c,1);
					}
			}
			//System.out.println(hm);
			Iterator<Character> character = hm.keySet().iterator();
			while(character.hasNext()){
				
				char temp = character.next();
				if(hm.get(temp)>1){
					System.out.println("the character " + temp + " has appered "+ hm.get(temp) + " times");
					
				}
			}
			
	}
	public static void main(String[] args){
			String str="alalalaaaa";
			char[] ch=str.toCharArray();
			findingDupliChar(ch);
			
	}

}