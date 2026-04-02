public class ThreadPrioritySleep {
    public static void main(String[] args){

        AThread aThread = new AThread();
        BThread bThread = new BThread();
        CThread cThread = new CThread();

        System.out.println("aThread Before : " + aThread.getPriority());
        System.out.println("bThread Before : " + bThread.getPriority());
        System.out.println("cThread Before : " + cThread.getPriority());

        /*
         Priority range will be from 1 to 10 (least to greatest)
         Thread Priorities and Corresponding values
         MIN_PRIORITY - 1
         NORM_PRIORITY - 5
         MAX_PRIORITY - 10

         and we can also set Priorities like MAX_PRIORITY - 1, 2, 3..., MAX_PRIORITY + 1, 2, 3...,
         NORM_PRIORITY + (1 to 5), NORM_PRIORITY 1 (1 to 5),
         */
        aThread.setPriority(Thread.MIN_PRIORITY);
        bThread.setPriority(Thread.NORM_PRIORITY);
        cThread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("aThread After : " + aThread.getPriority());
        System.out.println("bThread After : " + bThread.getPriority());
        System.out.println("cThread After : " + cThread.getPriority());

        /*
        We Cannot make the threads to control the flow, we can just only make the threads to prioritize this is wat we
        convey to the schedular and only way to do is making the code optimization using sleep method to make the thread
        to wait for some fractional seconds.More over we can include the try catch block either in tread class or in the
        code it our convenience to work
         */

        aThread.start();
        try {
            Thread.sleep(5);
        }
        catch (InterruptedException e) {
            System.out.println("ThreadPrioritySleep Interrupted");
        }

        bThread.start();
        try {
            Thread.sleep(3);
        }
        catch (InterruptedException e) {
            System.out.println("ThreadPrioritySleep Interrupted");
        }

        cThread.start();
        try {
            Thread.sleep(1);
        }
        catch (InterruptedException e) {
            System.out.println("ThreadPrioritySleep Interrupted");
        }



    }
}
