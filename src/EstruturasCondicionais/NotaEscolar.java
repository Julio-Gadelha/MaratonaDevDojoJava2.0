package EstruturasCondicionais;

import java.util.Scanner;

public class NotaEscolar {
   public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Digite sua media nota : ");
       double nota = sc.nextDouble();
       sc.close();
       if(nota <= 5){
           System.out.println("Recuperação");
       } else if(nota >= 7){
           System.out.println("Passou");
       } else if (nota ==10){
           System.out.println("Muito bem, você foi chamado para subir um nivel");
       }
    }
}
