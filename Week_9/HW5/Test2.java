//The driver Class 
public class Test2 {

	public static void main(String[] args) {

		int n = 10; // Number of threads 
		for (int i=0; i<n; i++) {

			Test obj = new Test(); 
            	obj.start(); //note: call start() on the object created
        	} 
    	} 
} 

