
class BookSeats{
	
	static int total_seats=10;
	
	static synchronized void bookSeats(int seats){
		
		if(seats<=total_seats){	
			System.out.println(seats+" seats booked successfully");
			total_seats=total_seats-seats;
			System.out.println(total_seats+" available seats ");
		}
		else{
			System.out.println(seats + " seats can't booked bcz available seats are only "+total_seats);
		}
	}

}
class MyThread1 extends Thread{
	BookSeats b;
	int seats;
	
	MyThread1(BookSeats b,int seats){
		this.b=b;
		this.seats=seats;
	}
	public void run(){
		b.bookSeats(seats);
	}
}
class MyThread2 extends Thread{
	BookSeats b;
	int seats;
	
	MyThread2(BookSeats b,int seats){
		this.b=b;
		this.seats=seats;
	}
	public void run(){
		b.bookSeats(seats);
	}
}

class MainStaticSynchroned{
	
	public static void main(String[] args){
		
		BookSeats b=new BookSeats();
		MyThread1 t1=new MyThread1(b,6);
		t1.start();
		
		MyThread1 t2=new MyThread1(b,7);
		t2.start();
		
		BookSeats b1=new BookSeats();
		MyThread2 t3=new MyThread2(b1,6);
		t3.start();
		MyThread2 t4=new MyThread2(b1,3);
		t4.start();
		
	}
}

/*
here as per availability only 9 seats are booked that means data inconsistency is avoided because it 
acuired the class level monitor lock
6 seats booked successfully
4 available seats
7 seats can't booked bcz available seats are only 4
3 seats booked successfully
1 available seats
6 seats can't booked bcz available seats are only 1
*/