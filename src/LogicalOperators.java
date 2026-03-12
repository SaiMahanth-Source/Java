public class LogicalOperators {
    public static void main(String[] args){

        int i1 = 11;
        int i2 = 19;
        int i3 = 13;
        System.out.println("AND operations : " + (i1 > i2 && i1 > i3));
        System.out.println("OR operations : " + (i2 > i3 || i2 > i1));
        boolean b = !(i3 > i2);
        System.out.println("NOT Operation : " + b);
        System.out.println("XOR Operation : " + (i1 ^ i2)); // Same bits 0, different bits 1
    }
}
