class Laptop{
    static String brand;
    int price;
    String model;
    String colour;
    /* price, model are instance variables which belongs to object
    and variables when created inside the method then they were local variables */
    public void show(){
        System.out.println(brand + " : " + price + " : " + model);
    }
    public static void show2(Laptop l){
        System.out.println(brand + " : " + l.colour + " : " + l.price + " : " + l.model);
        /* we can access only static variables, we cannot access instance variable in the static methods but it
        possible when they are referred with object */
    }
}

public class StaticMethod {
    public static void main(String[] args){ /* Here this static keyword is used because it was the static point of jvm
        and also if it was no static then it need reference object to call the method but in order to create a class
        and object we need a method which is public void static main */

        Laptop l1 = new  Laptop();
        l1.brand = "Macbook";
        l1.price = 1900;
        l1.model = "2022";
        l1.colour = "Red";

        Laptop l2 = new  Laptop();
        l2.brand = "Macbook";
        l2.price = 2100;
        l2.model = "2025";
        l2.colour = "Black";

        Laptop l3 = new  Laptop();
        l3.brand = "Macbook";
        l3.price = 3000;
        l3.model = "2026";
        l3.colour = "White";

        Laptop[] laptops = new Laptop[3];
        laptops[0] = l1;
        laptops[1] = l2;
        laptops[2] = l3;

        for(Laptop l : laptops){
            l.show2(l);
        }
    }
}
