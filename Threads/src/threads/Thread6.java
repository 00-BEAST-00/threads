package threads;

class Thr extends Thread{
public void run() {    
	System.out.println("shutdown task has completed::");
}
}
public class Thread6{
public static void main(String args[]) throws Exception {  
		    
		Runtime r=Runtime.getRuntime();    
		r.addShutdownHook(new Thr());    
		        
		System.out.println("Now main sleeping... press ctrl+c to exit");    
		try{Thread.sleep(3000);}catch (Exception e) { }    
		}    
		}    
/*System.out.println(Thread.currentThread().getName());    
}    
}
public class Thread6{
public static void main(String[] args) {    
Thr runnable = new Thr();    

//THREAD GROUP

ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");    
Thread t1 = new Thread(tg1, runnable,"one");    
t1.start();    
Thread t2 = new Thread(tg1, runnable,"two");    
t2.start();    
Thread t3 = new Thread(tg1, runnable,"three");   
t3.start();    
System.out.println("Thread Group Name: "+tg1.getName());    
tg1.list();    */
		    
		      
	


