

import java.util.*;


class HashMapIterating{

	
	public static void main(String[] args){
	
		
		HashMap<Integer , String> hm=new HashMap<>();
		hm.put(1,"anushri");
		hm.put(2,"aradhya");
		hm.put(3,"santosh");
		hm.put(4,"sakshi");
		hm.put(6,"srushti");
		
		for(Map.Entry<Integer,String> entry: hm.entrySet()){
		
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		Iterator<Map.Entry<Integer,String>> itr=hm.entrySet().iterator();
		
		while(itr.hasNext()){
			
			Map.Entry<Integer,String> entry=itr.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
		
		
	}
}