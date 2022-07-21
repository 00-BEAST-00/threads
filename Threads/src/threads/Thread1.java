
//THREAD CONCEPTS

package threads;

class Threadss extends Thread {
	
	 
	 synchronized public void run() {
		
		for(int i = 0; i<=5; i++) {
			
			
			//synchronized 
			System.out.println("Thread is running::" + getName());
			Thread.currentThread().getName();
			//System.out.println(Thread.currentThread().getName());
			Thread.currentThread().getPriority();
		
		
		try 
		{
			Thread.sleep(1500);
		}
		catch(InterruptedException e)
		{
			
			e.printStackTrace();
			
		}
		
		}
	}
}


public class Thread1{
	public static void main(String[] args) {
		
      Threadss t1 = new Threadss();
      t1.setName("Thread-A");
      t1.setPriority(Thread.MIN_PRIORITY);
      
      Threadss t2 = new Threadss();
      t2.setName("Thread-B");
      t2.setPriority(Thread.NORM_PRIORITY);
      
      t1.start();
      try {
   	 
		t1.join();
		
	} 
      catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      t2.start();
      
      /*th.start();
      th.setName("Thread-A");
      th.setPriority(Thread.MAX_PRIORITY);*/
      
      
	}

}
