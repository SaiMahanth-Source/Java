public class JaggedArray {
    public static void main(String[] args){

        int[][][]  numsj = new int[3][][];
        numsj[0] = new int[3][3];
        numsj[1] = new int[1][1];
        numsj[2] = new int[2][2];

        for(int i = 0; i < numsj.length; i++){
            for(int j = 0; j < numsj[i].length; j++){
                for(int k = 0; k < numsj[i][j].length; k++){
                    numsj[i][j][k] = (int)(Math.random()*100);
                }
            }
        }

        System.out.println("Printing 3 Dimensional Jagged Integer array : ");
        for(int i = 0; i < numsj.length; i++){
            for(int j = 0; j < numsj[i].length; j++){
                for(int k = 0; k < numsj[i][j].length; k++){
                    System.out.print(numsj[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
