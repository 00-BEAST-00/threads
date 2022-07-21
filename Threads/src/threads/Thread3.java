package threads;

 class Th extends Thread {

	public void run() {
	if(Thread.currentThread().isDaemon()) {
		System.out.println("daemon::");
	}else {
		System.out.println("no");
	}
}
 }
    
public class Thread3 {
	public static void main(String[] args) {
		Th t = new Th();
		t.setDaemon(true);//DEAMON::
		t.start();
		
	}
}

