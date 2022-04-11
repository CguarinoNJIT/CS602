import java.util.*;

public class Zerosum implements Runnable {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 0, 0));
    
    //Method for Calorie GAIN 
    public void gainCalories(){ 
        for(int i=0; i<1000; i++){
            synchronized(list){
                list.set(0, list.get(0)+1);
                list.set(2, list.get(2)+1);
            }
        }
    }

    //Method for Calorie BURN
    public void burnCalories(){
        while(true){
            synchronized(list){
                if(list.get(2) > 0){
                    list.set(1, list.get(1)+1);
                    list.set(2, list.get(2)-1);
                }
            }
            if(list.get(1) == 1000)
                break;
        }
    }

    //Thread Run Method
    public void run(){
        if(Thread.currentThread().getName().compareTo("gain") == 0){
            this.gainCalories();
        }
        else this.burnCalories();
    }

    //Executable main Method 
    //Confirms that our Multi-Threaded program runs properly. 
    public static void main(String[] args) {
        Zerosum subject = new Zerosum();
        Thread thread_1 = new Thread(subject, "gain");
        Thread thread_2 = new Thread(subject, "burn");
        thread_1.start();
        thread_2.start();
        
        try {
            thread_1.join();
            thread_2.join();
        } 
        catch(Exception e){
        }
        System.out.println("Caloric Balance: "+subject.list.get(2));
    }

}