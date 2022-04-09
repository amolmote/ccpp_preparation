


class StringEvenNumberAddition{

	public static int evenNumberAddition(char[] ch){
		
		int sum=0;
		for(int i=0;i<ch.length;i++){
			try{
					int val=Integer.valueOf(String.valueOf(ch[i]));  //char convert to string and string  again convert to int
				if(val  % 2==0){
					sum=sum+val;
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
			
			
		}
		return sum;
	}
	public static void main(String[] args){
		
		String str="java is a very8649 nice language";
		
		char[] ch=str.toCharArray();
		
		int result=evenNumberAddition(ch);
		System.out.println(result);
	}
}