package chapter02;

/**
 * Created by Nick
 * explain
 * Datetime: 2018/6/15 16:37
 */
/**
第二种方式
class RunnableThread extends Thread {
 */
class RunnableThread implements Runnable {
    private Thread t;
    private String threadName;

    RunnableThread(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run(){
        System.out.println("Running " + threadName);
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(3000);
            }
        }
        catch (InterruptedException ex)
        {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start(){
        System.out.println("Starting " +  threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
public class RunnableDemo {
    public static void main(String args[]) {
        RunnableThread r1 = new RunnableThread("Thread-1");
        r1.start();

        RunnableThread r2 = new RunnableThread("Thread-2");
        r2.start();
    }
}
