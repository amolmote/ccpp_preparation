


interface ABC{

		void m1();
		
		static void m2(){
			System.out.println("i am concrete method 1 in interface");
			
		}
		default void m3(){
			System.out.println("i am concrete method 2 in interface");
			
		}
}

class InterfaceDemoOfConcreteMethods implements ABC{
	
	public void m1(){
		System.out.println("child class override method");
	}
	/*
	public void m3(){
				System.out.println("child class override default method");

	}
	static void m2(){
			System.out.println("child class override static method");
			
		}
		*/
	public static void main(String[] args){
	
			ABC i=new InterfaceDemoOfConcreteMethods();
			i.m1();
			i.m3();
			//InterfaceDemoOfConcreteMethods.m2();
			ABC.m2();
	
	}

}