

import java.util.*;

class DuplicateFromList{


	public static int findingDuplicate(List<Integer> list, int maxLength){
		
		int sumOfElements=0,dupli;
		for(int n:list){
			sumOfElements+=n;
		}
		dupli=sumOfElements-maxLength*(maxLength+1)/2;
		
		return dupli;
	}
	public static void main(String[] args){

		List<Integer> list=new ArrayList<>();
		
		int maxLength=10;
		
		for(int i=0;i<=maxLength;i++){
			
			list.add(i);
			
		}
		list.add(6);
		
		int ele=findingDuplicate(list,maxLength);
		System.out.print(ele);
		
	}
}
	