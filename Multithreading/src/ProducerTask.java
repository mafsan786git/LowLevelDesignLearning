public class ProducerTask implements Runnable {
    SharedResource sharedResource;

    public ProducerTask(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }


    @Override
    public void run() {
        System.out.println("Producer thread: "+Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }
        sharedResource.addItems();
    }
}
