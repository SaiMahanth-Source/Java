import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinallyResources {
    public static void main(String[] args) throws IOException {

        int i;
//        BufferedReader br1 = null ;
//        try{
//            br1 = new BufferedReader(new InputStreamReader(System.in));
//            i = 11/Integer.parseInt(br1.readLine());
//        }
//        catch(IOException io){
//            System.out.println(io);
//        }
//        finally{
//            br1.close();
//            // System.out.println("executing finally block irrespective of excetion which is used to close the resources");
//            System.out.println("Closing the bufferReader resource ");
//        }

        /*
        Instead of Finally new feature introduced by java which is auto closing the resource opened
         */
        try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))){
            i = 19/ Integer.parseInt(br2.readLine());
        }
    }
}
