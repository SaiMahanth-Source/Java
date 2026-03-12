public class WrapperClass {
    public static void main(String[] args) {

        int n1 = 8 ; // Primitive data type
//        Integer num = new Integer(n1); // Boxing storing primitive as object in class of type Integer
        Integer num = n1;// Autoboxing

        int n2 = num.intValue(); // Unboxing Integer type to primitive
        int n3 = num;// Auto Unboxing

        String str = "11";
        int n4 = Integer.parseInt(str); // Parsing the String value into integer
        // For int we are having Integer
        // For Char we are having Character
        // For double we are having Double and like that respective Wrapper classes
        System.out.println(num);
        System.out.println(n4);
    }
}
