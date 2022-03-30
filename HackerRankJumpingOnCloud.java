
import java.util.*;


class HackerRankJumpingOnCloud{

		public static int jumpingOnClouds(List<Integer> c){
			int[] arr = new int[c.size()];
			int count = -1; //even the length is ended the else part is going to execute one more extra time
			
			for(int i = 0;i<c.size();i++){
				arr[i]=c.get(i);
			}
			
			for(int j=0;j<arr.length;){
				if(j+2<arr.length && arr[j+2]==0){
					j=j+2;
				
				}
				else{
					j=j+1;
				}
				count++;
			}
			return count;
		}
		
		public static int jumpingOnClouds1(List<Integer> c){
			int[] arr = new int[c.size()];
			int count = -1; //even the length is ended the else part is going to execute one more extra time
			
			for(int i = 0;i<c.size();i++){
				arr[i]=c.get(i);
			}
			
			for(int j=0;j<arr.length;){
				if(j+2<arr.length && arr[j+2]==0){
					j=j+1;
				
				}
				
					j=j+1;
				
				count++;
			}
			return count;
		}
		
		
		public static void main(String[] args){
			
			List<Integer> list = new ArrayList<>();
			
			list.add(0);
			list.add(0);
			list.add(0);
			list.add(0);
			list.add(1);
			list.add(0);
			int count = jumpingOnClouds(list);
			
			System.out.println("minimum jump is= "+count);
			
			int count1 = jumpingOnClouds1(list);
			System.out.println("minimum jump is= "+count1);
			
			
		}
}