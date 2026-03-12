class Calc{
    // Concept of method overloading is same method name or different parameters or different parameter types
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args){

        Calc calculator = new Calc();
        System.out.println(calculator.add(11, 19));
        System.out.println(calculator.add(11, 19, 13));
        System.out.println(calculator.add(19.1311, 13));
    }
}
