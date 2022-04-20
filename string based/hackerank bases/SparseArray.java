

import java.util.*;


class SparseArray{
	
	
	public static int[] queryStringArray(String[] input, String[] query){
		
		HashMap<String,Integer> hm=new HashMap<>();
		
		for(String str: input){
			
			if(hm.containsKey(str)){
				hm.put(str,hm.get(str)+1);
			}
			else{
				hm.put(str,1);
			}
		}
		int[] result=new int[hm.size()];
		int j=0;
		for(int i=0;i<query.length;i++){
			
			if(hm.containsKey(query[i])){
				result[j]=hm.get(query[i]);
				j++;
				
			}
		}
		
		
		return result;
		
		
	}
	public static void main(String[] args){
		
		String[] input={"ab","ab","baba","abxb"};
		
		String[] query={"ab","ab","baba","xyz"};
		
		//exprected output [2,1,0] after comparing input and query string
		
		int[] ans=queryStringArray(input,query);
		
		
		System.out.println(Arrays.toString(ans));
		
	}
}