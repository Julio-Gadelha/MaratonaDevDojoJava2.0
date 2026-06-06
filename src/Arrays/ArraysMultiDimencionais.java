package Arrays;

public class ArraysMultiDimencionais {
 public    static void main(String[] args) {

     int[][] dias = new int[12][];
     dias[0][0] = 53;
     dias[0][1] = 35;
     dias[0][2] = 33;

     dias[1][0] = 39;
     dias[1][1] = 33;
     dias[1][2] = 34;

     for (int i = 0; i < dias.length ; i++) {
         for (int j = 0; j <dias[0].length ; j++) {
             System.out.println(dias[i][j]);
         }
     }


 }
}
