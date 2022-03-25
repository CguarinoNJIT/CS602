import java.util.*;

public class Zerosum implements Runnable {
//first element of arraylist : total gain calories
//second element of arraylist : total burn calories
//third element of arraylist : balance : gain calories - burn calories
ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 0, 0));
public void gainCalories()
{
for(int i=0; i<1000; i++)
{
synchronized(list)
{
list.set(0, list.get(0)+1);
list.set(2, list.get(2)+1);
}
}
}

public void burnCalories()
{
while(true)
{
synchronized(list)
{
if(list.get(2) > 0)
{
list.set(1, list.get(1)+1);
list.set(2, list.get(2)-1);
}
}
if(list.get(1) == 1000)
break;
}
}

public void run(){
if(Thread.currentThread().getName().compareTo("gain") == 0)
{
this.gainCalories();
}
else this.burnCalories();
}

//for testing purposes
public static void main(String[] args) {
Zerosum myobj = new Zerosum();
Thread t1 = new Thread(myobj, "gain");
Thread t2 = new Thread(myobj, "burn");
t1.start();
t2.start();
try {
t1.join();
t2.join();
} catch(Exception e) {
}
System.out.println("Final Balance: "+myobj.list.get(2));
}

}