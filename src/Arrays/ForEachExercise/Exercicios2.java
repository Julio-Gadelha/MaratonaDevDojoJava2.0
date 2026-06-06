package Arrays.ForEachExercise;

import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] numeros = new int[5];
    int soma = 0  ;

    for (int i = 0 ; i < 5 ; i++){
        System.out.println("Digite os  numeros para serem somados  : ");
        numeros[i] = sc.nextInt();
    }
        System.out.println("Numeros aceitos");

    for(int num : numeros){
        soma += num;
        System.out.println("O valor e : " + soma);
        sc.close();
    }
    }
}
