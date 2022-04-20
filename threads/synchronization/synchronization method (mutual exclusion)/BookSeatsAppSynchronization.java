
/*
synchronized keyword is used to the resouce method bcz of that only one thread can acquire 
the resource at a time

->internally :- every object in java have their unique object monitor lock
 every resource has 2 part one is synhronized and other one is non-synchronized 
 
 -> to acquire the synchronized section thread object must required to acuire the object monitor then only 
 it can access the resource
 
 ->once the any of the thread acquire the object monitor lock then other thread can't acquire the lock, 
 it waits till the first thread release that lock
 
*/
class BookSeatsSynchronizely{

	int total_seats=10;
	
	synchronized void bookSeats(int seats){
		
		if(total_seats>=seats){
			System.out.println(seats+" booked successfully");
			total_seats=total_seats-seats;
			System.out.println(total_seats+ " remained seats");
			
		}
		else{
			
			System.out.println("seats can't booked");
			System.out.println(total_seats + " available only ");
			
		}
	}
}
//Thread
class BookSeatsAppSynchronization extends Thread{
	
	static BookSeatsSynchronizely b;
	int seats;  //instance variable of BookSeatsApp 
	
	public void run(){
		b.bookSeats(seats);
	}
	
	public static void main(String[] args){
	//here both the thread try to acquire the resource at a time so may happen data inconsisteny
	
		b=new BookSeatsSynchronizely();
		
		//creating Thread
		BookSeatsAppSynchronization t1=new BookSeatsAppSynchronization();
		t1.seats=6;
		t1.start();
		
		//2nd Thread
		BookSeatsAppSynchronization t2=new BookSeatsAppSynchronization();
		t2.seats=8;
		t2.start();
		
	}
}

/*

6 booked successfully
4 remained seats
seats can't booked
4 available only

*/