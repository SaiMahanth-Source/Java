public class SwitchStatement {
    public static void main(String[] args){

        int n = 1 ;
        switch(n){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
//            case 1, 2 :
//                System.out.println("Monday");
//                break; // This is also allowed
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid number enter a valid value : ");
        }
        System.out.println("--------------------------------------");
        // Before java 5 only int supported in java and after String is also supported
        // Updated switch statement
        String day = "Monday";
        switch(day){
            case "Saturday", "Sunday" -> System.out.println("10AM");
            case "Monday" -> System.out.println("7AM");
            default -> System.out.println("8AM");
        }
        System.out.println("--------------------------------------");
        // Switch can also be usd as an expression
        String result = "";
        switch(day){
            case "Saturday", "Sunday" -> result = "10AM";
            case "Monday" -> result = "7AM";
            default -> result = "8AM";
        }
        System.out.println(result);
        System.out.println("--------------------------------------");
        String result2 = switch(day){
            case "Saturday", "Sunday" -> "10AM";
            case "Monday" -> "7AM";
            default -> "8AM";
        }; // Semicolon is needed as it was the expression
        System.out.println(result2);
        System.out.println("--------------------------------------");
        String result3 = switch(day){
            case "Saturday", "Sunday" : yield "10AM";
            case "Monday" : yield "7AM";
            default : yield "8AM";
        }; // Semicolon is needed as it was the expression
        System.out.println(result3);
    }
}
