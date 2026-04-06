package Arrays.ExercicioArrays;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            soma = soma + numeros[i];
        }


        System.out.println("A soma total é: " + soma);

        sc.close();
    }
}
