class Car{
    private String company;
    static String type = "Sedan";
    private String model;
    private String color;
    private int year;

    public Car(){/* Even thought default constructor was not mentioned it is there */
        System.out.println("Default Car Constructor");
    }
    public Car(String company, String model, String color, int year) {
        /* Parameterized constructor of Car */
        this.company = company;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public Car(String model, String color, int year) {
        /* Parameterized constructor of Car */
        this.company = "BMW";
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public void  display(Car car) {
        System.out.println("Details of Car type : " + Car.type );
        System.out.println("Company: " + car.company);
        System.out.println("Model: " + car.model);
        System.out.println("Color: " + car.color);
        System.out.println("Year: " + car.year);
    }
}

public class ConstructorParameterizedConstructor {
    public static void main(String[] args){

        Car car1 = new Car();
        Car car2 = new Car("Mercedes", "GL3", "Metallic Blue", 2022);
        Car car3 = new Car("M4 Competition", "Matte Black", 2024);

        Car[] cars = new Car[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        for(Car c : cars){
            c.display(c);
        }
    }
}
