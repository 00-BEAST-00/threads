package threads;

class thread implements Runnable{
	
synchronized public void  run() {
			
			System.out.println("Thread-ID::" + Thread.currentThread().getId());
			System.out.println("Thread_Name::" + Thread.currentThread().getName());
			System.out.println("Thread-PRIORITY::" + Thread.currentThread().getPriority());
			System.out.println(Thread.currentThread().isDaemon());
			
 try {
	 Thread.sleep(1500);		
	     if(Thread.currentThread().isAlive()) { 
		     System.out.println("Thread is present" + Thread.currentThread().isAlive());
			
		        if(Thread.currentThread().isDaemon()) {
					
				System.out.println("Thread in Daemon::" + Thread.currentThread().isDaemon());}
				  
		 else{System.out.println("Daemon is not present::" + Thread.currentThread().isDaemon());}}
			    
	 else {System.out.println("Thread is not present" + Thread.currentThread().isAlive());}}
 
 catch(Exception e) {
			
			 e.printStackTrace();}}}

public class Thread4{
public static void main(String[] args) {
		
	thread t = new thread();
	Thread th = new Thread(t);
	th.setName("Thread-A");
	th.setPriority(Thread.MAX_PRIORITY);
	th.isDaemon();
	th.setDaemon(true);
	th.start();
	
	try {th.join();} 
	
      catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	thread t1 = new thread();
	Thread th1 = new Thread(t1);
	th1.setName("Thread-B");
	th1.setPriority(Thread.NORM_PRIORITY);
	th1.start();
	
	try {th1.join();} 
	
      catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	thread t2 = new thread();
	Thread th2 = new Thread(t2);
	th2.setName("Thread-c");
	th2.setPriority(Thread.MIN_PRIORITY);
	th2.start();
	
	
	try {th2.join();} 
	
      catch (InterruptedException e) {
		
		e.printStackTrace();
	}	
  }
}
