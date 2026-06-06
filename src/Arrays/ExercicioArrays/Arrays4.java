package Arrays.ExercicioArrays;

import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];
        int soma = 0;
        int media = 0;


        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            soma = soma + numeros[i];
            media = soma /6;
        }

        System.out.println("A media nos numeros são : " + media);


        sc.close();
    }
}
