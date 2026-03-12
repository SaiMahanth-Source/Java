class Bike {
    static String company;
    float price;
    String model;
    String colour;
    static {
        company = "Yamaha";
        System.out.println("In static block");
        /* the static block is called only once unlike constructor
        because we are having special area in jvm which is called class loader whihc will be having all class loaded
        but by default no class is load the moment and the class will be loaded from library to class loader which
        happens only once for the object creation itself it will load the class adn static block will be executed
        at the same time since class loading happens first so static block will be called first and then constructor */
    }
    Bike (){
        price = 1199.99f;
        model = "R15";
        colour = "Deep Blue";
        // System.out.println("In constructor");
        /* Constructor is called everytime when object is created */
    }
    public static void show(Bike b){
        System.out.println(company + ":" + b.price + " : " +  b.model + " : " + b.colour );
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

//        Bike b1 = new Bike();
//
//        Bike b2 = new Bike();
//        b1.price = 1900.11f;
//        b1.model = "R1";
//        b1.colour = "Matte Black";
//
//        Bike b3 = new Bike();
//        b3.price = 2100.19f;
//        b3.model = "R6";
//        b3.colour = "Red";
//
//        Bike[] bikes = new Bike[3];
//        bikes[0] = b1;
//        bikes[1] = b2;
//        bikes[2] = b3;
//        for(Bike b : bikes){
//            b.show(b);
//        }

        /* And irrespective of object creation if we want to call the static block by loading class which can be
        achieved by using method forName which belongs to Class class by passing the class name and this forName is the
        static method belongs to Class class */

        Class.forName("Bike"); // which will not create the object but it will instantiate
    }
}
