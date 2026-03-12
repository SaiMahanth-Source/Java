class Sup{
    public void showSup(){
        System.out.println("Super");
    }
}
class Sub extends Sup{
    public void showSub(){
        System.out.println("Sub");
    }
}

public class UpCastingAndDownCasting {
    public static void main(String[] args){

        Sup sup = (Sup) new Sub();
        /*
        Reference is parent and implementation is child now object Sub() is upcasting to parent type
        */

//        Sup sup = new Sup(); // Even though (Sup) is not mentioned implicitly it's there
        sup.showSup();

//        sup.showsub() we cannot call method because Sup doesn't know Sub exists so now
        Sub sub = (Sub) sup; // Here we are down casting parent reference type to child at run time
        sub.showSub();
    }
}
