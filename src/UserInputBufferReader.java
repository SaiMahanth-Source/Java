import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputBufferReader {
    public static void main(String[] args) throws IOException {

//        int num1 = System.in.read();
        /* which gives the ASCII value of the input character on the keyboard and cannot
        read more than one character
         */
//        System.out.println(num1 - 48);
        // Instead of this we will be using BufferREader for the user input


        InputStreamReader isr = new InputStreamReader(System.in);
        /*
        BufferReader can take input from file, data, console.etc and we have to close once reading is done
         */
        BufferedReader br = new BufferedReader(isr);
        int num2 = br.read(); // Reads only one character

        System.out.println(num2);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Reads the character enter which is new line '\n'
        br.close();// Closing the resource to prevent from the data leak if it closed before scanner then we cannot
        // read input from the user vis System.in
        System.out.println(str);
    }
}
