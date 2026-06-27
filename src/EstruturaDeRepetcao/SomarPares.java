package EstruturaDeRepetcao;

public class SomarPares {
   public  static void main(String[] args) {
       int somar = 0;
       for (int i = 0; i <=100 ; i++) {
           if (i  %2==0){
              somar = somar + i;
           }
       }
       System.out.println(somar);
    }
}
