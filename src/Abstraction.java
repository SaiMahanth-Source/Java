abstract class LuxaryCar{
    public static final void  display(){
        System.out.println("Luxary Car Details : ");
    }
    public abstract void Drive();

    /*
    abstract class can have either only abstract methods or only implemented methods or both
    make method abstract when not sure about the implementation like feature is coming soon but not aware how it is
    being implemented
     */

    public void playMusic(){
        System.out.println("Music Playing  ");
    }
    protected void wheels(){
        System.out.println("Wheels are of type Alloy ");
    }

    private String series ;
    public void setSeries(String series){
        this.series = series;
    }
    public void getSeries(LuxaryCar car){
        System.out.println("Series : " + car.series);
    }
    private static final String colour = "Black";
    public void getColour(){
        System.out.println("Variet : " + colour);
    }
}
class Bmw extends LuxaryCar{
    public void Drive(){
        System.out.println("Bmw can Drive");
    }
    public void fly(){
        System.out.println("Bmw can Fly");
    }
}

class Mercedes extends LuxaryCar{
    public void Drive(){
        System.out.println("Mercedes can Drive");
    }

}
class Audi extends LuxaryCar{
    public void Drive(){
        System.out.println("Audi can Drive");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        LuxaryCar car1 = new Bmw();
        car1.setSeries("M");


        LuxaryCar car2 = new Mercedes();
        car2.setSeries("GL");

        LuxaryCar car3 = new Audi();
        car3.setSeries("A3");

        LuxaryCar[] cars = new LuxaryCar[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        LuxaryCar.display();
        for (LuxaryCar car : cars){
            System.out.println("----------------------------------------");
            System.out.println("Company : " + car.getClass().getName());
            if(car.getClass().getName().equals("Bmw")){
                Bmw luxcar = (Bmw)car;
                luxcar.getSeries(car);
                luxcar.Drive();
                luxcar.wheels();
                luxcar.playMusic();
                luxcar.getColour();
                luxcar.fly();
            }
            else {
                car.getSeries(car);
                car.Drive();
                car.wheels();
                car.playMusic();
                car.getColour();
            }
        }
    }
}
