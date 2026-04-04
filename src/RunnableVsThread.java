//class RunThread1 implements Runnable{
//    public void run(){ // run method executes because of the concept of method overriding
//
//        for(int i = 0; i< 119 ; i++){
//            System.out.println("In class runThread1");
//            try{
//                Thread.sleep(11); // sleep is a static method belongs to Thread class
//            }
//            catch(InterruptedException e){
//                System.out.println(e);
//            }
////             this is to make it delay for some time so that other thread can proceed with execution
//        }
//    }
//}

//class RunThread2 implements Runnable{
//    public void run(){ // run method executes because of the concept of method overriding
//
//        for(int i = 0; i< 119 ; i++){
//            System.out.println("In class runThread2");
//            try{
//                Thread.sleep(11);
//            }
//            catch(InterruptedException e){
//                System.out.println(e);
//            }
////            this is to make it delay for some time so that other thread can proceed with execution
//        }
//    }
//}

public class RunnableVsThread {
    public static void main(String[] args){

        /*
        Runnable interface is a functional interface so we are implementing the run method using anonymous inner class
        and lambda expression and main use case is to extend another class because when we extend to threads we cannot
        extend to any other class in order to avoid this runnable comes into the picture
         */
        Runnable runThread1 = () -> { // run method executes because of the concept of method overriding

                for(int i = 0; i< 119 ; i++){
                    System.out.println("In class runThread1");
                    try{ Thread.sleep(11); } catch(InterruptedException e){ System.out.println(e); }
//             this is to make it delay for some time so that other thread can proceed with execution
                }
            };

        Runnable runThread2 = () -> { // run method executes because of the concept of method overriding

                for(int i = 0; i< 119 ; i++){
                    System.out.println("In class runThread2");
                    try{ Thread.sleep(11); } catch(InterruptedException e){ System.out.println(e); }
//            this is to make it delay for some time so that other thread can proceed with execution
                }
            };

        /*
        Thread class accepts the runnable object so we can us e the methods
        in Thread class
        */

        Thread t1 = new Thread(runThread1);
        Thread t2 = new Thread(runThread2);

        t1.start();
        t2.start();
    }
}
