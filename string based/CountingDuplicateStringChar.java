
import java.util.*;


class CountingDuplicateStringChar{

	
	public static void countStringChar(String str){
	
		char[] ch=str.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(char i : ch){
			
			if(hm.get(i)!=null){
				hm.put(i,hm.get(i)+1);
			}
			else{
				hm.put(i,1);
			}
		}
			Iterator<Character> itr=hm.keySet().iterator();
			
			while(itr.hasNext()){
				char temp=itr.next();
				
				if(hm.get(temp)>1){
					System.out.println("the char "+temp+" has apperred "+hm.get(temp)+" times " );
				}
			}
		
	
	}
	public static void main(String[] args){
		
		String str="this is it";
		//space also count
		countStringChar(str);
	}
}
