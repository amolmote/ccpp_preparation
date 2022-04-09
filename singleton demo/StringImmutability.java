




class StringImmutability{

	
						public static void main(String[] args){
							
							String str="ab";
							str = "abcd";
							
							
							str=str.concat("yz");
							System.out.println(str);
						}
						
}