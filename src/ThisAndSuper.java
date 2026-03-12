class A{
    public A(){
        super();
        System.out.println("In A Constructor of Parent Class");
    }
    public A(int n){
        this();
        System.out.println("In A parameterized Constructor of Parent Class");
    }
}
class B extends A{
    public B(){
        super(); // It is there by default though not mentioned so parent constructor wil be executed first before this
        System.out.println("In B Constructor of sub Class ");
    }
    public B(int n ){
        super(n);
        System.out.println("In B parametrized Constructor of Sub Class");
    }
}

public class ThisAndSuper {
    public static void main(String[] args){

        B b = new B(11);
        /*
        Based of super(), this() methods functioning will be changing this belongs to current class and super belongs
        to the parent class
         */
    }
}
