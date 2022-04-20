
//problem without wait()

class TotalEarning  extends Thread{

	int total_earn=0;
	
	public void run(){
		
		for(int i=1;i<=10;i++){
		
			total_earn=total_earn+100;
		}
	}

}
class BookMyShowProblem{
	
	
	public static void main(String[] args){
		/*
			here output is returned as 0
			
			bcz main thread and user thread start excuting at a time and main thread executes before
			user thread and terminate the code.so we required to release the object monitor lock of
			main thread and wait for some time till the execution of user thread complete
			
			once the user thread finish its execution, it will notify the main thread to acquire the 
			object monitor lock
			
			for using wait(), notify() we have to use object monitor lock on thread otherwise it will throw
			IntereptedException
		*/
		TotalEarning t=new TotalEarning();
		t.start();
		System.out.println(t.total_earn);
		
	}
}