
public class MultithreadingRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("Code implementing Runnable: "+ Thread.currentThread().getName());
    }
}
