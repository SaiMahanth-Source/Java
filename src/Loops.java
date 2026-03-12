public class Loops {
    public static void main(String[] args){

        // While Loops executing un til the condition is false
        int i = 1;
        while(i <= 11){
            System.out.println("Hi : " + i);
            i++;
        }

        //Do While loop is used when to execute the loop atleast once though condition is false
        do{
            System.out.println("Hello : " + i);
            i++;
        }while(i < 1);

        // For loop is used when the statement needs to be executed finite number of times
        for(int j = 1; j < 11; j++){
            System.out.println("Haloh : " + j);
        }
    }
}
