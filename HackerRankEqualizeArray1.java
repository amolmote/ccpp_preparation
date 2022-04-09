
import java.util.*;

class HackerRankEqualizeArray{

	public static int equalizeArray(List<Integer> arr) {
		int[] arr1 =new int[arr.size()];
		
		//putting all data in an array
		for(int i = 0;i<arr.size();i++){
			arr1[i]=arr.get(i);
		}
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		int count = 0;
		//now get data one by one and add into map
		for(int i : arr){
			
			if(hm.get(i)!=null){
				//if map already have that data then increase count of that
				hm.put(i , hm.get(i)+1);
				//either  we can return this by substracting from array length
				
			}
			else{
				hm.put(i,1);
				count++;
			}
		
		}
		
		
		return count;
	
    }
	public static void main(String[] args){
			List<Integer> list = new ArrayList<>();
			list.add(3);
			list.add(3);
			list.add(2);
			list.add(1);
			list.add(3);
			int count = equalizeArray(list);
			
			System.out.println(count); //it should return 2 i.e. 2,1
			
	}
}