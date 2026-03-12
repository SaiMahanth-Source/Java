class PreFinal{
    // final class PreFinal{
    static double PIE = 3.14 ;
    static final String string = "No Value" ;
    public void show(){
        System.out.println("In show method of PreFinal class : ");
    }
    public final void  display(){
        System.out.println("In display method of PreFinal class : "); // Final method not applicable for overriding
    }
}

class Final extends PreFinal{ // If super class is final then inheritance is not applicable
    public void show(){
        System.out.println("In show method of Final class : ");
    }
//    public final void  display(){
//        System.out.println("In display method of PreFinal class : "); // Final method not applicable for overriding
//    }
}

public class FinalKeyword {
    public static void main(String[] args){

        PreFinal pf = new  Final();
        pf.display();
        pf.show();
        System.out.println("Constant value : " + pf.PIE);
        // pf.string = "value" ; // Error out because variable is final

    }
}
