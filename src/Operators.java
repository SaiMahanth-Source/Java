public class Operators {
    public static void main(String[] args){

        // Operators
        // Arithmetic Operators
        int i1 = 19;
        int i2 = 11;
        System.out.println(i1 + i2);
        System.out.println(i1 - i2);
        System.out.println(i1 * i2);
        System.out.println(i1 / i2);
        System.out.println(i1 % i2);

        i1 = i1 + 1;
        i1 += 1;
        //Similarly we are having for all the operators
        System.out.println(i1 += 1);
        System.out.println(i1 -= 1);
        System.out.println(i1 *= 2);
        System.out.println(i1 /= 2);
        System.out.println(i1 %= 2);

        // Increment and decrement operators
        // Pre-increment and post-increment
        // ++i and i++

        int num1 = 11;
        int num2 = 19;
        int result1 = num1 + ++num2;
        //int result2 = num1 + num2++;

        System.out.println("------------------------------");
        System.out.println("Pre - increment result1 : " + result1);
        System.out.println("Value of num2 after pre increment addition : " + num2);
//        System.out.println("Post increment result1 : " + result2);
//        System.out.println("Value of num2 after post increment addition : " + num2);
        // Similar to this pre decrement - post decrement are vice versa od addition
        //int result3 = num1 + --num2;
        //int result2 = num1 + num2--;
    }
}
