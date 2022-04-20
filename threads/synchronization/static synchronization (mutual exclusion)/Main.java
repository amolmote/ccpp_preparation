

//problem without static synchronized
/*
here even we synchronized the resource still we faced the problem of data inconsistency 
bcz the total_seats is available for both the threads independently,so it may be possible that
both the thread of different classes book the seats

->this happened due to both the thread of different classes acquired  the object monitor lock 
bcz in java every object has their unique object monitor lock bcz of this inconsistency happened

->to avoid this if we use static keyword with with synchronized, then it provide class level monitor lock,
that means one class thread can access the resource only....and the resource is sharable to all the object
it reads the changed(latest seats available) values


*/

class BookSeats{
	
	int total_seats=10;
	
	synchronized void bookSeats(int seats){
		
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

class Main{
	
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
only 10  seats available and total 16 seats are booked here

6 seats booked successfully
4 available seats
7 seats can't booked bcz available seats are only 4
3 seats booked successfully
7 available seats
6 seats booked successfully
1 available seats
*/