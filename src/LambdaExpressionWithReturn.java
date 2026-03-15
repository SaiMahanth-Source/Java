interface BooleanArgs{
    boolean calculateBoolean(int n1, int n2);
}

public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        BooleanArgs b = new BooleanArgs() {
            @Override
            public boolean calculateBoolean(int n1, int n2) {
                if (n1 == n2) {
                    return true;
                } else {
                    return false;
                }
            }
        };
//        BooleanArgs b = (n1, n2) -> { // Need not mention the return type as well as compiler knows it
//            return (n1 == n2 ? true : false);
//        };
        System.out.println(b.calculateBoolean(11, 11));
        System.out.println(b.calculateBoolean(11, 19));
    }
}
