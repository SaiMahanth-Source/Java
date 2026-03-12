public class TypeCastingAndTypeConversion {
    public static void main(String[] args){

        byte by1 = 127;
        int i1 = by1; // type conversion implicit conversion / Widening is called type conversion

        int i2 = 127;
        //byte by2 = i2; // Not allowed instead
        byte by2 = (byte)i2; // Narrowing or explicit conversion is called type casting

        float f = 11.9f;
        //int i3 = f; // Not allowed instead
        int i3 = (int)f; // Probably lossy conversion .9 is excluded

        System.out.println(i1);
        System.out.println(by2);
        System.out.println(i3);

    }
}
