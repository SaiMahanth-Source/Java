class Outer{
    static final String str = "Outer Class member ";
    protected void show(){
        System.out.println("In outer class method show ");
    }
    class Inner{
        static final String str = "Inner Class member ";
        protected void show(){
            System.out.println("In Inner class method show ");
        }
    }
    static class InnerStatic{ // We can have a static class inside a class
        static final String str = "Inner Static Class member ";
        protected void show(){
            System.out.println("In Inner Static class method Show ");
        }
    }
    class InnerChild extends Outer{ // We can also inherit the properties of Outer class as a child

    }
}

public class InnerClass {
    public static void main(String[] args){

        Outer out = new Outer();
        System.out.println(out.str);
        out.show();

        // For creating object ob inner class we need object of outer class because it is member of outer class
        Outer.Inner oi = out.new Inner();
        System.out.println(oi.str);
        oi.show();


        // But when the inner class is static then we directly create object using Outer class name
        Outer.InnerStatic ois = new Outer.InnerStatic();
        System.out.println(ois.str);
        ois.show();

        // Creating object for inner child class to inherit properties of parent class Outer
        Outer.InnerChild oic = out.new InnerChild();
        System.out.println("Calling parent variable using child inner class  : " + oic.str);
        oic.show();
    }
}
