
class ArmStrongNumber{
	
	
	public static boolean isArmstrong(int num){
		
		int temp=num;
		int sum=0;
		while(temp>0){
			int rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
			
		}
		System.out.println(sum);
		if(sum==num)
		return true;
		else
		return false;
	
	}
	
	public static void main(String[] args){
	
		int num=153;
		
		boolean flag=isArmstrong(num);
		
		System.out.println(flag);
	
	}


}