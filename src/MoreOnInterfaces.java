interface TestSubmarine extends Submarine{ // Interfaces can be extended using extend keyword
    void testDepth();
    void testSpeed();
}
interface ToySubmarine{
    void toyDepth();
    void toySpeed();
}

class InsArighat implements TestSubmarine, ToySubmarine{ /*
    Any class implementing should implement all the methods which includes parent interface as well
    and can implement multiple interfaces
    */
    public void testDepth(){
        System.out.println("Can reach up to 300 meters");
    }
    public void testSpeed(){
        System.out.println("Can attain 40 Kph");
    }

    @Override
    public void depth() {
        System.out.println("Can reach up to 500 meters");
    }

    @Override
    public void speed() {
        System.out.println("Can attain 60 Kph");
    }
    public void toyDepth(){
        System.out.println("Maximum depth is 10 metres");
    }
    public void toySpeed(){
        System.out.println("Maximum speed is 20 metres");
    }
}

public class MoreOnInterfaces {
    public static void main(String[] args) {

        TestSubmarine testSubmarine = new InsArighat();
        testSubmarine.testDepth();
        testSubmarine.testSpeed();
        testSubmarine.depth();
        testSubmarine.speed();

        ToySubmarine toySubmarine = new InsArighat();
        toySubmarine.toyDepth();
        toySubmarine.toySpeed();
    }
}
