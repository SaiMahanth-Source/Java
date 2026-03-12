interface Annotate{
    void show();
    void display();
}
class AnnotateImplement implements Annotate{
    public void show(){
        System.out.println("Annotate implementation of method show");
    }
    public void display(){
        System.out.println("Annotate implementation of method display");
    }
}


public class Annotation {
    public static void main(String[] args){

        Annotate annotate = new  Annotate(){
            @Override
            public void show(){
                System.out.println("Annotate implementation of method show using anonymous inner class");
            }
            @Override
            public void display(){
                System.out.println("Annotate implementation of method display using anonymous inner class");
            }
        };
        annotate.show();
        annotate.display();
    }
}
