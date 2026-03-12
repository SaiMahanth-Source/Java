class Inheritance {
    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        System.out.println(i.getClass());
        /*
        We can also create object for our class also just came to know,
        and also until unless we make the class public file name and class name need not to be same
         */
        AdvancedCalculator c = new AdvancedCalculator();
        System.out.println("Addition : " + c.add(11,19));
        System.out.println("Substraction : " + c.sub(19,11));
        System.out.println("Multiplication : " + c.mul(11,19));
        System.out.println("Division : " + c.div(11,19));
        System.out.println("Modular Division : " + c.mod(19,11));
        c.show();
    }
}
