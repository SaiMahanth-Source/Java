class UserException extends Exception{
    /*
    UserException to be an exception it was extended to Exception likewise to acquire the properties for any it has to
    be extended to the parent class simple analogy is either you create one or use one
     */
    public UserException(String string){ // Constructor to be included as part of implementation
        super(string); // Passing the string to super class fro which saem does by the exception
    }
}

public class CustomException {
    public static void main(String[] args) {

        int num = 11;
        try{
            if(num/19 == 0){
                throw new UserException("Unexpected error occurred"); // Throwing new CustomException created as part of execution
            }
        }
        catch(UserException ue){ // catch block for the CustomException
            System.out.println(ue);
        }
    }
}
