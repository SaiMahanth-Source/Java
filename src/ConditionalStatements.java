public class ConditionalStatements {
    public static void main(String[] args){

        byte by = 127;
        System.out.println("If - else conditional statement : ");
        if(by < 127 && by > -127){
            System.out.println("Within the byte range");
        }
        else{
            System.out.println("Out of range ");
        }
        System.out.println("-------------------------------------");
        System.out.println("If - else if conditional statement : ");
        int i1 = 11;
        int i2 = 13;
        int i3 = 19;
        if(i1 > i2 && i1 > i3){
            System.out.println("Bigger Value is : " + i1);
        }
        else if (i2 > i3) {
            System.out.println("Bigger values is : " + i2);
        }
        else {
            System.out.println("Bigger value is : " + i3);
        }
        System.out.println("----------------------------------------");
        System.out.println("Ternary Operator");
        //int i = (i1 > i2 && i1 > i3) ? i1 : ((i2 > i3) ? i2 : i3);
        System.out.println((i1 > i2 && i1 > i3) ? i1 : ((i2 > i3) ? i2 : i3));



    }
}
