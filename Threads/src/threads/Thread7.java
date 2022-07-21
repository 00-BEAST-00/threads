package threads;

 /*class t extends Thread{
	 
	 public void run() { 
		 System.out.println("Thread1::" + Thread.currentThread().getId());
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
 }
	 class th extends Thread{
	 public void run() {
		 System.out.println("Thread2::" + Thread.currentThread().getId());
	 }
	 }
	 
	 public class Thread7{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		t thread1 = new t();
		thread1.start();
		thread1.suspend();
		thread1.resume();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th thread2 = new th();
		thread2.start();
		
	}

}*/
class Customer{    
int amount=10000;    
    
synchronized void withdraw(int amount){    
System.out.println("going to withdraw...");    
    
if(this.amount<amount){    
System.out.println("Less balance; waiting for deposit...");    
try{wait();}catch(Exception e){}    
}    
this.amount-=amount;    
System.out.println("withdraw completed...");    
}    
    
synchronized void deposit(int amount){    
System.out.println("going to deposit...");    
this.amount+=amount;    
System.out.println("deposit completed... ");    
notify();    
}    
}    
    
class Thread7{    
public static void main(String args[]){    
final Customer c=new Customer();    
new Thread()
{    
public void run()
{
c.withdraw(15000);
}    
}.start();    
new Thread(){    
public void run(){c.deposit(10000);}    
}.start();    
    
}}    



