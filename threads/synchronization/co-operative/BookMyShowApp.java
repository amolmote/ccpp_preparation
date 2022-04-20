


//solution

class TotalEarning  extends Thread{

	int total_earn=0;
	
	
		public void run(){
			
			synchronized(this){
				
				for(int i=1;i<=10;i++){
				
					total_earn=total_earn+100;
				}
			}
			this.notifyAll(); //it tell the used thread to release the lock and main thread acquire that lock
		}
		
	
	

}
class BookMyShowApp{
	
	
	public static void main(String[] args) throws InterruptedException,IllegalMonitorStateException{
		
		TotalEarning t=new TotalEarning();
		t.start();
		
		synchronized(t){
			t.wait();
			System.out.println(t.total_earn);
		}
		
		
	}
}