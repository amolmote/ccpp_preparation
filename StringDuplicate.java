import java.util.*;


class StringDuplicate{



		static void findingNumberOfDuplicates(String str){
			
			HashMap<String,Integer> hm=new HashMap<>();
			
			
			String[] s = str.split(" ");
			
			for(String temp : s){
				//hm.put(temp,1);
				System.out.println(" "+hm.get(temp));
				
				if(hm.get(temp)!=null){
					//if something already present in map then update it
					hm.put(temp,hm.get(temp)+1);
					
				}
				else{
					hm.put(temp,1);
					
				}
			}
			//identifying the duplicate String if it is >1 then it is duplicate
			Iterator<String> temp=hm.keySet().iterator();
			while(temp.hasNext()){
				
				String tmp= temp.next();
				if(hm.get(tmp)>1){
					System.out.println("the word "+tmp+" "+" appeared " + hm.get(tmp)+" no of times ");
					
				}
				
			}
		
		}
		
		public static void main(String[] args){
		
				
			findingNumberOfDuplicates("hello java java");
			
					
		}

}