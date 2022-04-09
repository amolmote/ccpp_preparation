

//singleton that means single instance of object is created we can't create multiple instance
class Singleton{

	private static Singleton INSTANCE;
	
	public static Singleton getInstance(){
		synchronized (Singleton.class){
			if(INSTANCE==null){
				INSTANCE = new Singleton();
				return INSTANCE;
			}
			return INSTANCE;
			
		}
	}
	
	public void sample(){
		System.out.println("called by instance");
		
	}
	
	public static void main(String[] args){
		
		Singleton obj1= Singleton.getInstance();
		obj1.sample();
		
		Singleton obj2 = Singleton.getInstance();
		obj2.sample();
		
		System.out.println(obj1==obj2);
		//System.out.println(obj1.hashCode());
	}
}