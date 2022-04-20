

/*
synchronized block is used to synchronize the perticular block of code which we want to synchronize
bcz of that other thread does not required to wait for that code to execute it wait only for the
the code (resource) inside the synchronized block 

*/
class BookSeats{

	int total_seats=10;
	
	void bookSeats(int seats){
	
		System.out.println(Thread.currentThread().getName());	
		System.out.println(Thread.currentThread().getName());	
		System.out.println(Thread.currentThread().getName());	
		System.out.println(Thread.currentThread().getName());	
		System.out.println(Thread.currentThread().getName());	
		
		//only one thread can access that resource
		synchronized(this){
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
			System.out.println(Thread.currentThread().getName());	
			System.out.println(Thread.currentThread().getName());	
			System.out.println(Thread.currentThread().getName());	
			System.out.println(Thread.currentThread().getName());	
			System.out.println(Thread.currentThread().getName());
		
	}
}
//Thread
class BookSeatsApp extends Thread{
	
	static BookSeats b;
	int seats;  //instance variable of BookSeatsApp 
	
	public void run(){
		b.bookSeats(seats);
	}
	
	public static void main(String[] args){
	//here both the thread try to acquire the resource at a time so may happen data inconsisteny
	
		b=new BookSeats();
		
		//creating Thread
		BookSeatsApp t1=new BookSeatsApp();
		t1.seats=6;
		t1.start();
		
		//2nd Thread
		BookSeatsApp t2=new BookSeatsApp();
		t2.seats=8;
		t2.start();
		
	}
}
/*
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-1
Thread-1
Thread-1
Thread-1
Thread-1
6 booked successfully
4 remained seats
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
seats can't booked
4 available only
Thread-1
Thread-1
Thread-1
Thread-1
Thread-1
*/