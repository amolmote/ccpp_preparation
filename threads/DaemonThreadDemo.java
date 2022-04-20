

//daemon thread(low priority) provide service to the other thread 
//it run in background to the other thread

class DaemonThreadDemo extends Thread{

	public void run(){
		
		System.out.println(Thread.currentThread().isDaemon());
		//this will not print bcz daemon run in background only provide service but does not do anything 
		//but if thread is another thread which can print this
		System.out.println("daemon thread create");
	}
	
	public static void main(String[] args){
		
		DaemonThreadDemo t=new DaemonThreadDemo();
		/*
			daemon thread is required to created before thread start 
			otherwise it will throw ElligleThreadStateException
			bcz of above reason we can't create main thread as daemon thread
		*/
		t.setDaemon(true);
		
		//now we can happily start the thread
		t.start();//it will call run method internally but it will not work bcz daemon provide service to the main method
		
		//life of daemon thread:
		/*
			it's life depend on another thread where daemon runs in background of the thread
			
			nature:
			daemon thread inherites properties from its parent thread(here main is the parent of daemon thread)
			
			priority:
			in most of the cases daemon thread low priority but we can change it 
			according to the need 
			
		*/
		DaemonThreadDemo t2=new DaemonThreadDemo();
		t2.start(); //it will print output bcz this is user thread
		
		
		
		
	}
}