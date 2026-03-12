class Mobile{
    static String brand;
    int price;
    String model;
    /* price, model are instance variables which belongs to object
    and variables when created inside the method then they were local variables */
    public void show(){
        System.out.println(brand + " : " + price + " : " + model);
    }
}

public class StaticVariable {
    public static void main(String[] args){

        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 2000;
        m1.model = "Mini";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 2100;
        m2.model = "Foldable";

        Mobile m3 = new Mobile();
        m3.brand = "Samsung";
        m3.price = 3000;
        m3.model = "Smartphone";
        /* At this instant brand is same so we can make that variable as static
        when variable is static then it is a class member so we can refer that variable
        directly with class name instead */
        Mobile[] mobiles = new  Mobile[3];
        mobiles[0] = m1;
        mobiles[1] = m2;
        mobiles[2] = m3;
        System.out.println(Mobile.brand + " " + "Deatils : ");
        for(Mobile m:mobiles){
            m.show() ;
        }
    }
}
