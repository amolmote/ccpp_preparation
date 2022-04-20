


//counting a's from infinite string


	
class RepeatedInfiniteString{


	public static int getMaxCountFromString(String s, int n){
		
		int length=s.length();
		int q=n/length;
		int r=n%length;
		int subStringLength=(r==0)?0:r;
		
		int a_count=q*countingA(s,length)+countingA(s,subStringLength);
		return a_count;
		
	}
	public static int countingA(String s, int length){
	
		int count=0;
		for(int i=0;i<length;i++){
			
			if(s.charAt(i)=='a'){
				count++;
				
			}
		}
		return count;
	}

	public static void main(String[] args){
	
		//optimal approch is to count the a's without concat from every repeated string
		
		String s="abc";
		
		int n=10;
		
		int count=getMaxCountFromString(s,n);
		
		System.out.println(count);
		
		
	}
	
}