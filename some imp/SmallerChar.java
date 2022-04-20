


class SmallerChar{
	
	public static char findingSmaller(char[] ch,char key){
		int start=0;
		int last=ch.length-1;
		
		
		while(start<=last){
			int mid=start+(last-start)/2;
			if(key>ch[mid]){
				start=mid+1;
			}
			else{
				last=mid-1;
			}
		}
		return ch[start % ch.length];
		
	}
	public static void main(String[] args){
	
		
		char[] ch={'e','h','k'};
		
	
		char key='a';
		char ans=findingSmaller(ch,key);
		System.out.println(ans);
	}
}