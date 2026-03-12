class Parent{
    public void show(){
        System.out.println("In Parent class show method : ");
    }
    public void config(){
        System.out.println("In Parent class config method : ");
    }
}
class Child{
    public void show(){
        System.out.println("In Child class show method : ");
    }
    public void config(){
        System.out.println("In Child class config method : ");
    }
    static void display(){
        System.out.println(" Nothing to display : ");
    }
}
public class MethodOverriding {
    public static void main(String[] args){

        Parent p = new Parent();
        p.show();
        p.config();
        Child c = new Child();
        /*
        Child class can access all the methods from parent and if and only if methods of same name were not implemented
        in the child class if so then methods will be called from same class of object type
        */
        c.show();
        c.config();
        c.display(); // Static method can be called using class name as it was class member but not object member
        Child.display();
    }
}
