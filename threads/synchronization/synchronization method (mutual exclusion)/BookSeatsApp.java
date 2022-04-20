
//problem without synchronization ->data inconsistency

class BookSeats{

	int total_seats=10;
	
	public void bookSeats(int seats){
		
		if(total_seats>=seats){
			System.out.println(seats+" booked successfully");
			total_seats=total_seats-seats;
			System.out.println(total_seats+ "remained seats");
			
		}
		else{
			
			System.out.println("seats can't booked");
			System.out.println(total_seats + "available only ");
			
		}
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
this is not the proper output bcz both the thread book the seats
8 booked successfully
2remained seats
6 booked successfully
-4remained seats
*/