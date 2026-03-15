@FunctionalInterface
interface Boolean{
    void calculateBoolean();
}


public class LambdaExpression {
    public static void main(String[] args){

        Boolean b1 = () -> {
            System.out.println(true); /* Single statement we can write in one line and the reduced default
            implementation, but it's there behind scene
            */
        };

        //Boolean b1 = () -> System.out.println(true);
        b1.calculateBoolean();
    }
}
