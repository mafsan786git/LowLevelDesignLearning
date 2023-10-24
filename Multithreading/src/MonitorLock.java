public class MonitorLock {

    public synchronized void task1(){
        try{
            System.out.println("inside task 1");
            Thread.sleep(10000);
            System.out.println("inside task 1 completed");
        }catch (Exception e){

        }
    }

    public void task2(){
            System.out.println("inside task 2, before synchronized");
            synchronized (this){
                System.out.println("inside task 2, synchronized");
            }
    }

    public void task3(){
        System.out.println("inside task 3");
    }
}
