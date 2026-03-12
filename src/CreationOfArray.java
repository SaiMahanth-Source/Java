public class CreationOfArray {
    public static void main(String[] args){

        int nums1[] = {11, 13, 19} ; // Initialising array directly
        nums1[1] = 21 ; // We can assign the values using index position
        int[] nums2 = new int[5] ; // Dynamic array and at this time values are zero for int and null for string unless initialised
        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;
        nums2[3] = 4;
        nums2[4] = 5;

        System.out.println("Using normal for loop : ") ;
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println("\nUsing enhanced for loop : ");
        for(int n : nums1){
            if (n%2 != 0) {
                System.out.print((n + 1) + " ");
            }
            else{
                System.out.print(n + " ");
            }
        }
    }
}
