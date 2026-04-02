class AThread extends Thread{
    public void run(){ // run method executes because of the concept of method overriding

        for(int i = 0; i< 1119 ; i++){
            System.out.println("In class ATread");
//            try{
//                Thread.sleep(11); // sleep is a static method belongs to Thread class
//            }
//            catch(InterruptedException e){
//                System.out.println(e);
//            }
//             this is to make it delay for some time so that other thread can proceed with execution
        }
    }
}

class BThread extends Thread{
    public void run(){ // run method executes because of the concept of method overriding

        for(int i = 0; i< 1119 ; i++){
            System.out.println("In class BThread");
//            try{
//                Thread.sleep(11);
//            }
//            catch(InterruptedException e){
//                System.out.println(e);
//            }
//            this is to make it delay for some time so that other thread can proceed with execution
        }
    }
}

class CThread extends Thread{
    public void run(){ // run method executes because of the concept of method overriding

        for(int i = 0; i< 1119 ; i++){
            System.out.println("In class CThread");
//            try{
//                Thread.sleep(11);
//            }
//            catch(InterruptedException e){
//                System.out.println(e);
//            }
//            this is to make it delay for some time so that other thread can proceed with execution
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args){

        AThread athread = new AThread();
        BThread bthread = new BThread();

        athread.start(); // start method is to start the thread which belong to Thread class
        bthread.start();
    }
}
