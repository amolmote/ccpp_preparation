

class DeleteRepetaedCharacterFromBothStrings{

	public static void deleteDuplicate(String str1, String str2 ){
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		for(int i=0;i<arr1.length;i++){
			boolean match=false;
			
			for(int j=0;j<arr2.length;j++){
				if((String.valueOf(arr1[i])).toLowerCase().equals((String.valueOf(arr2[j])).toLowerCase())){
					 match=true;
					break;
				}
			}
			if(match){
				str1=str1.replaceAll(String.valueOf(arr1[i]).toUpperCase(),"");
				str1=str1.replaceAll(String.valueOf(arr1[i]).toLowerCase(), "");
				str2=str2.replaceAll(String.valueOf(arr2[i]).toUpperCase(), "");
				str2=str2.replaceAll(String.valueOf(arr2[i]).toLowerCase(), "");
			}

			
		}
					System.out.println("modified str1 "+str1+" modified str2 "+str2);
	}
	public static void main(String[] args){
		
		String str1="aBc";
		String str2="bcde";
		
		
		
		deleteDuplicate(str1,str2);
		
	}

} 