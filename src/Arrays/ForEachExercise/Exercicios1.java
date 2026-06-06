package Arrays.ForEachExercise;

import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int [] numeros = new int[5];

        for (int i = 0; i <5 ; i++) {
            System.out.println("Digite o primeiro numero : ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Valores Digitados ");
        for (int num : numeros) {
            System.out.println(num);
        }
        sc.close();

    }
}
