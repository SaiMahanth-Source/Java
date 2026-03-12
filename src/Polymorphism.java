class ABC{
    public void  show(){
        System.out.println("In ABC show method");
    }
    public void show(String str){
        System.out.println("In ABC show method: " + str);
    }
}
class XYZ extends ABC{
    public void  show(){
        System.out.println("In XYZ show method");
    }
}

public class Polymorphism {
    public static void main(String[] args){


        ABC abc = new ABC(); // Here reference type is ABC parent and implementation is also ABC
        abc.show("A"); // Compile time polymorphism

        abc = new XYZ(); // Here reference type is ABC parent and implementation is XYZ
        abc.show();// Runtime polymhorpism or we can call it as Dynamic method dispatch
    }
}
