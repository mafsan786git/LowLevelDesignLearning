public class SharedResource {
    private boolean availableItem = false;

    //synchronized put monitor lock
    public synchronized void addItems(){
        availableItem = true;
        System.out.println("Item added by: "+Thread.currentThread().getName() + " and invoking all thread which are " +
                "waiting ");
        notifyAll();
    }

    public synchronized void consumerItem(){
        System.out.println("ConsumerItem method invoked by: "+Thread.currentThread().getName());

        //using while loop to avoid "spurious wake up", sometimes because of system noise
        //spurious wake up ----a threading which is waiting may be woke-up due to some noise
        while (!availableItem){
            try {
                System.out.println("Consumer Thread "+ Thread.currentThread().getName() + " is waiting now.");
                wait();//it releases monitor lock
            }catch (Exception e){

            }
        }
        System.out.println("Item consumed by: "+Thread.currentThread().getName());
        availableItem = false;
    }

}
