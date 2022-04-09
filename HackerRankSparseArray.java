
import java.util.*;

class HackerRankSparseArray{

		  public static List<Integer> matchingStrings(List<String> list1, List<String> list2) {
			
				//converting list to arrays;
				String[] strings = new String[list1.size()];	
				String[] queries = new String[list2.size()];
				
				for(int i = 0;i<list1.size();i++){
					strings[i]=list1.get(i);
				}
				for(int j = 0;j<list2.size();j++){
					queries[j]=list2.get(j);
				}
				
				Map<String, Integer> hm = new HashMap<>();
				
				
				for(int k = 0;k<strings.length;k++){
					String str = strings[k];
					if(hm.get(str)!=null){
						hm.put(str , hm.get(str)+1);
					}
					else{
						hm.put(str , 1);
					}
				}
				
				//now the final touch of solution compare the elements of queries arr and map if it is present then
				//put the values into result list
					List<Integer> result = new ArrayList<>();
				
				for(int l=0 ; l<queries.length;l++){
					
					String str = queries[l];
					
					if(hm.containsKey(str)){
						result.add(hm.get(str));
					}
					else{
						result.add(0);
					}
				}
				
				return result;

			}
		public static void main(String[] args){
			List<String> list1 = new ArrayList<>();
			list1.add("aba");
			list1.add("baba");
			list1.add("aba");
			list1.add("xzab");
			
			List<String> list2 = new ArrayList<>();
			list2.add("aba");
			list2.add("xzab");
			list2.add("ab");
			
			List<Integer> list = matchingStrings(list1,list2);
			
			System.out.println(list);
			
			
		}
}