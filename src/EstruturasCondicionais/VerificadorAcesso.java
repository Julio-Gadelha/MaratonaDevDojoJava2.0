package EstruturasCondicionais;

import java.util.Scanner;

public class VerificadorAcesso {
   public  static void main(String[] args) {
       Scanner  sc = new Scanner(System.in);
       System.out.println("Digite sua idade : ");
       int idade = sc.nextInt();
       System.out.println("Tem id ? true or false  ");
       boolean id = sc.nextBoolean();
       sc.close();
       if (idade >=18 && id == true){
           System.out.println("Acesso liberado");
       }
       System.out.println("Acesso negado");
    }
}
