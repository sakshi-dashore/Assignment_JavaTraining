package Multithreading;

class Display{
	synchronized public void print(String msg) {
		System.out.print("Hello");
		System.out.print("\t"+msg);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("\t"+"Bye");
		System.out.println();
	}
}

class Message implements Runnable{
	Display d1;
	Thread t1;
	String msg;
	
	Message(Display d1,String msg){
		this.d1 = d1;
		this.msg = msg;
		t1 = new Thread(this);
		t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		d1.print(msg);
	}
	
}

class DisplayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		
		new Message(d,"AAA");
		new Message(d,"BBB");
		new Message(d,"CCC");
		new Message(d,"DDD");
		new Message(d,"EEE");
		
		
		
	}

}

