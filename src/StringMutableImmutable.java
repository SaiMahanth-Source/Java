public class StringMutableImmutable {
    public static void main(String[] args){

        String str1 = new String(); // Creating a String object and assigning value
        str1 = "Mahanth";
        String str2 = new String("Sai Mahanth"); // Creating and passing teh String value in the constructor
        String str3 = "Sai Mahanth Nagendla"; // New syntax directly assigning string value
        String str4 = "Alpha";
        String str5 = "Aplha"; // At this point str4 and str5 are stroing same address value of object created

        System.out.println("\nString Buffer : ");
        StringBuffer sb1 = new StringBuffer() ;
        System.out.println(sb1.capacity()) ;
        StringBuffer sb2 = new StringBuffer(str3) ;
        System.out.println(sb2.capacity()) ;
        sb1.append(str2);
        System.out.println(sb2+ " : " + sb2.capacity()) ;
        System.out.println(sb1.charAt(5));
        System.out.println(sb2.compareTo(sb1));
        System.out.println(sb2.substring(5, 19));
        System.out.println(sb2.deleteCharAt(13));
        System.out.println(sb2.insert(13, 'C'));
        System.out.println(sb2.reverse());

        System.out.println("\nString Builder : ");
        StringBuilder sb3 = new StringBuilder("Aplha") ;
        System.out.println(sb3.capacity());

        String str = "Mahanth";
        String str6 = "";
        for(int i = str.length() - 1; i >= 0 ; i--){
            str6 += str.charAt(i);
        }
        System.out.println("String reverse without using reverse function : ");
        System.out.println(str6 + " : " + str6.length());
    }
}
