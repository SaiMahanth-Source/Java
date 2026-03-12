interface Submarine{
    String name = "Indian - Submarine"; /*
     By default, variables will be Final and static, and we can have No final static variable because interface
     doesn't have any heap memory
     */
    void depth();
    void speed();
}


class InsKalavari implements Submarine{ /*
    Keyword used for implementation is implements, if implementation is not done here then this will be an abstract class
    */
    public void depth(){
        System.out.println("Soon will test and finalize the depth");
    }
    public void speed(){
        System.out.println("Soon it will be announced");
    }
}

public class Interfaces {
    public static void main(String[] args){

        Submarine submarine = new InsKalavari();
        System.out.println(Submarine.name); // Name is static so we can call using Interface name or object name
        submarine.depth();
        submarine.speed();



    }
}
