

import java.util.*;

class HackerRankEqualizingArray2{

		public static int equalizeArray(List<Integer> arr) {
			
			//copy all the element in temp array
			
			int[] temp = new int[101];  //101 bcz constrain is given 100
			
			for(int i = 0;i<arr.size();i++){
				int j=arr.get(i);
				System.out.println(j);
				temp[j]++;
				
			}
			
			int maxFreqcount = getMaxFreqCount(temp);
			
			return arr.size()-maxFreqcount;
			

      }
	  
	  public static int getMaxFreqCount(int[] temp){
			int maxFreqcount = Integer.MIN_VALUE;
			for(int freqCount : temp){
				if(freqCount > maxFreqcount){
					
					maxFreqcount = freqCount;
					System.out.println(maxFreqcount);
				}
			}
			
			return maxFreqcount;
	  }
		public static void main(String[] args){
				
				//int[] arr={1,2,2,2,2,3,3,3,};
				List<Integer> list = new ArrayList<>();
				list.add(1);
				list.add(2);
				list.add(2);
				list.add(2);
				list.add(2);
				list.add(3);
				list.add(3);
				list.add(3);
				
				int count= equalizeArray(list);
				System.out.println(count);
		}
}