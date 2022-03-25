import java.lang.Thread;

// public class Test extends Thread {
	
// 	protected int count, inc, delay;
	
// 	public Test(int init, int inc, int delay) {
// 		this.count = init;
// 		this.inc = inc;
// 		this.delay = delay;
// 	}
	
// 	public void run() {
// 		try {
// 			for(;;) {
// 				System.out.print(count + " ");
// 				count += inc;
// 				sleep(delay);
// 			}
// 		} catch (InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 	}
		
// 	public static void main(String[] args) {
// 		new Test(0, 1, 50).start();
// 		new Test(0, -1, 50).start();
// 	}
	
// }

public class Test extends Thread {

	public void run() {

		try {

		// Displaying the thread that is running 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + " is running"); 
  		} catch (Exception e) {

			// Throw an exception 
            	System.out.println ("Exception is caught");
 
        	}
    	} 
} 
  
//The driver Class 
public class Multithread {

	public static void main(String[] args) {

		int n = 5; // Number of threads 
		for (int i=0; i<n; i++) {

			Test obj = new MultithreadingDemo(); 
            	obj.start(); //note: call start() on the object created
        	} 
    	} 
} 
