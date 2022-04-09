


class ArmStrongUpdated{

	public static boolean isArmstrong(int num){
		
		int temp = num;
		int digits = (int)(Math.log10(num))+1;
		
		int sum = 0;
		while(temp>0){
			int rem = temp % 10;
			sum=sum+(int)(Math.pow(rem , digits));
			
			temp = temp/10;
			
			
		}
		System.out.println(sum);
		if(num == sum)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args){
		int num =153;
		boolean flag = isArmstrong(num);
		System.out.println(flag);
	}
}