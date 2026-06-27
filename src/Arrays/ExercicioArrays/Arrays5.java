package Arrays.ExercicioArrays;

import java.util.Scanner;

public class Arrays5 {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double [] nota = new double[10];

       for (int i = 0; i < 10; i++) {
           System.out.println("Digite suas nota :" +i);
           nota[i] = sc.nextInt();
       }
       double maiorNota= nota[0];
       for (int i = 1; i <10 ; i++) {
           if (maiorNota < nota[i]){
               maiorNota = nota[i];
           }
       }
       System.out.println("A maior nota e : " + maiorNota);
       sc.close();
    }
}
