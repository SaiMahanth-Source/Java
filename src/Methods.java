class Computer{
    public void playMusic(){
        System.out.println("Music playing...");
    }
}
class Purchase{
    public String getMeAPen(int cost){
//        if (cost >= 11){ // cost value is >= 11 then if conditional statement
//            return "Pen";
//        } // Else this will be executed by default
//        return "Nothing";
        return cost>=11 ? "Pen" : "Nothing" ; // Instead we can use ternary operator
    }
}

public class Methods {
    public static void main (String[] args){

        Computer  comp = new Computer();
        Purchase pur = new Purchase();
        comp.playMusic();
        String str1 = pur.getMeAPen(3);
        System.out.println(str1);
    }
}
