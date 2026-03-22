public class ExceptionThrow {
    public static void main(String[] args) {

        String str = null ;
        try{
            System.out.println(str.length());
        }
        catch(Exception e){
            System.out.println(e);// java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
            System.out.println(e.getMessage());
        }

        int i1 = 19;

        try{
            int i2 = 11/19;
            if(i2 <= 0){
                throw new ArithmeticException(); // Throw keyword is used to throw new exception
            }
        }
        catch (ArithmeticException ae){
            System.out.println("Default O/P will be : " + 1);
        }
    }
}
