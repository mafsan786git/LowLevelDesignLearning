public class MultithreadingThread extends Thread{
    @Override
    public void run(){
        System.out.println("Code extending Thread: "+ Thread.currentThread().getName());
    }
}
