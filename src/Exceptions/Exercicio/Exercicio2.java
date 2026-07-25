package Exceptions.Exercicio;

import java.util.Scanner;

public class Exercicio2 {
  public   static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

      System.out.println("Digite um número: ");
      String entrada = sc.nextLine();

      try {
          int numero = Integer.parseInt(entrada);
          System.out.println("Número digitado: " + numero);
      } catch (NumberFormatException e) {
          System.out.println("Erro: '" + entrada + "' não é um número válido!");
      }

      sc.close();
    }

}
