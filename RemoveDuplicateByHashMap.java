
import java.util.*;

class RemoveDuplicateByHashMap{

	public static HashSet<Integer> removeDuplicateElement(int[] arr){
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
			
		}
		return set;
		
	}
	public static void main(String[] args){
		
		int[] arr={1,2,1,3,4,3,4,2,2};
		
		HashSet<Integer> hm=removeDuplicateElement(arr);
		
		System.out.println(hm);
		
		
	}

}