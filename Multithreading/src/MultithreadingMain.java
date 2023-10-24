public class MultithreadingMain {
    public static void main(String[] args) {
        System.out.println("Going inside main method: "+Thread.currentThread().getName());
//        MultithreadingRunnable multithreadingRunnable = new MultithreadingRunnable();
//        Thread thread = new Thread(multithreadingRunnable);
//        thread.start();

//        MultithreadingThread multithreadingThread = new MultithreadingThread();
//        multithreadingThread.start();
//        System.out.println("Finish main method: "+Thread.currentThread().getName());

        //Monitor lock is on Object always
//        MonitorLock monitorLock = new MonitorLock();
//        Thread t1 = new Thread(() -> {monitorLock.task1();});
//        Thread t2 = new Thread(() -> {monitorLock.task2();});
//        Thread t3 = new Thread(() -> {monitorLock.task3();});
//        t1.start();
//        t2.start();
//        t3.start();

        //Testing with example MonitorLock
        SharedResource sharedResource = new SharedResource();
        ProducerTask producerTask = new ProducerTask(sharedResource);
        ConsumerTask consumerTask = new ConsumerTask(sharedResource);
        Thread producerThread = new Thread(producerTask);
        Thread consumerThread = new Thread(consumerTask);
        producerThread.start();
        consumerThread.start();

        System.out.println("Main method end");
    }
}