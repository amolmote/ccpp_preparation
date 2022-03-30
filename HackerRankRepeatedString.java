


//importantHaskerankQuestion

class HackerRankRepeatedString{

			public static long repeatedString(String str, long n){
				int strLen = str.length();
				long quotient=n/strLen;
				long remLength=n%strLen;
				long partialLength=(remLength==0)?0:remLength;
				
				long countingA=quotient*getCountOfA(str,str.length())+getCountOfA(str,partialLength);
				
				return countingA;
			}
			
			public static long getCountOfA(String str,long strLen){
				long count=0;
				for(int i=0;i<strLen;i++){
					if(str.charAt(i)=='a'){
						count++;
						
					}
				}
				return count;
			}
		public static void main(String[] args){
		
			String str="abc";
			
			long n=10;
			
			long count = repeatedString(str,n);
			System.out.println(count);
			
				
			
		}
}