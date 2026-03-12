/* Generally we follow camel Casing for Naming convention
Class and Interface - Calculator, Runnable
variables - marks, show(), setName()
constants - PIE, BRAND
 */

class Pen{
    private String brand;
    private int price;
    public Pen(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    public String getName(){
        return this.brand;
    }
    public int getPrice(){
        return this.price;
    }
}

public class NamingConvention {
    public static void main(String[] args) {

        Pen p1 = new Pen("Linc", 11);
        Pen p2 = new Pen("Reynolds", 19);
        Pen p3 = new Pen("Brite", 5);

//        Pen[] pens = new Pen[3];
//        pens[0] = p1;
//        pens[1] = p2;
//        pens[2] = p3;
//        Pen[] pens = new  Pen[]{p1,p2,p3};
          Pen[] pens = {p1,p2,p3};

          for(Pen p : pens){
              System.out.println("Name - "+ p.getName() + " : " +  "Price - " + p.getPrice());
          }
    }
}
