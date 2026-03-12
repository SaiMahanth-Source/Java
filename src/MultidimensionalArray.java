public class MultidimensionalArray {
    public static void main(String[] args){

        int[][] nums = new int[3][3];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*100); // If not initialised then values will be zero
            }
        }

        System.out.println("\nPrinting 2 - dimensional Integer array : ");
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nPrinting 2 - dimensional String array : ");
        String[][] strings = new String[3][3];
        for(int i = 0; i < strings.length; i++){
            for(int j = 0; j < strings[i].length; j++){
                System.out.print(strings[i][j] + " "); // Not inialised so values will be null
            }
            System.out.println();
        }

        int[][][] nums3d = new int[3][3][3];
        for(int i = 0; i < nums3d.length; i++){
            for(int j = 0; j < nums3d[i].length; j++){
                for(int k = 0; k < nums3d[i][j].length; k++){
                    nums3d[i][j][k] = (int)(Math.random()*100);
                }
            }
        }
        System.out.println("\nPrinting 3 - dimensional Integer array : ");
        for(int i = 0; i < nums3d.length; i++){
            for(int j = 0; j < nums3d[i].length; j++){
                for(int k = 0; k < nums3d[i][j].length; k++){
                    System.out.print(nums3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}