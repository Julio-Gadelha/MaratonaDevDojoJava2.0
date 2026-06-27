package EstruturaDeRepetcao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero  inteiro que deseja fazer a tabuda : ");
        int numero = sc.nextInt();
        sc.close();

        for (int i = 0; i <=10 ; i++) {
            System.out.println( numero + " x " + i + " = " + (numero * i ));
        }

    }
}
