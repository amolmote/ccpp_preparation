
import java.util.*;


class RemoveAllDuplicateElementFromList{
	
	
	    public static List<Integer> removeDupli(List<Integer> list){
			List<Integer> withoutDupli=new ArrayList<>();
			
			for(int n : list){
				//if list already have an element then print that element otherwise add that element in list
				if(withoutDupli.contains(n)){
					System.out.println(n+" ");
				}
				else{
					withoutDupli.add(n);
				}
			}
			return withoutDupli;
		}
		public static void main(String[] args){
			
			List<Integer> list=new ArrayList<>();
			
			for(int i=0;i<=10;i++){
				list.add(i);
			}
			list.add(6);
			list.add(8);
			
			List<Integer> finalList = removeDupli(list);
			
			System.out.println(finalList);
			
		
			
		}

}