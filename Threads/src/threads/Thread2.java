
package threads;

public class Thread2 extends Thread{    
    public void run(){  
    	
        for(int i=1;i<=5;i++){    
         try{    
          Thread.sleep(500);    
         }catch(Exception e){System.out.println(e);}    
        System.out.println(i);    
        }    
       }    
      @SuppressWarnings("deprecation")
	public static void main(String args[]){    
    	  Thread2 t1=new Thread2();    
    	  Thread2 t2=new Thread2();    
    	  Thread2 t3=new Thread2(); 
    	 
       t1.start(); 
       t1.stop();
       try{   
    	  
    	   //JOIN::
    	   
        t1.join(); 
        
       }catch(Exception e){System.out.println(e);}
          
       t2.start();  
       //t2.stop();
       t3.start();    
       }    
}

