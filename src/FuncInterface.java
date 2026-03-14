@FunctionalInterface
interface func{
    void show(); // Functional interface will be having only one abstract method
}

public class FuncInterface {
    public static void main(String[] args) {

        func obj = new func(){
            public void show(){
                System.out.println("Hello World");
            }
        };
        obj.show();
    }
}
