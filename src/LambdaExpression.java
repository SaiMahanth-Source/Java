@FunctionalInterface
interface Boolean{
    void calculateBoolean();
}
interface BooleanArgs{
    void calculateBoolean(int n1, int n2);
}

public class LambdaExpression {
    public static void main(String[] args){

        Boolean b1 = () -> {
            System.out.println(true); /* Single statement we can write in one line and the reduced default
            implementation, but it's there behind
            */
        };

        //Boolean b1 = () -> System.out.println(true);

//        BooleanArgs b2 = new BooleanArgs() {
//            @Override
//            public void calculateBoolean(int n1, int n2) {
//                System.out.println(n1 == n2);
//            }
//        };

        BooleanArgs b2 = (n1, n2) -> { // Need not mention the return type as well as compiler knows it
                System.out.println(n1 == n2);
        };

        b1.calculateBoolean();
        b2.calculateBoolean(11, 19);
        b2.calculateBoolean(11, 11);
    }
}
