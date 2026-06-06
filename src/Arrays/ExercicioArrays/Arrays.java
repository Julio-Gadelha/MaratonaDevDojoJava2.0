package Arrays.ExercicioArrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o numero : ");
            numeros[i] = sc.nextInt();
        }
        int maior = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}
