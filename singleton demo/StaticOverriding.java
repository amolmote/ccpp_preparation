

class SuperClass{
	
		static void m1(){
		
			System.out.println("superclass method");
		}
}



public class StaticOverriding extends SuperClass{

		static void m1(){
		
			System.out.println("child class method");
		}
		public static void main(String[] args){
			
			//SuperClass obj = new StaticOverriding();
			StaticOverriding obj = new StaticOverriding();
			obj.m1();
			
		}
	
}