package IntroducaoMetodos.Test;

import IntroducaoMetodos.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("Finalizando o calculo do sistem operacional ");
        calculadora.subitrairDoisNumeros();
        System.out.println("finalizando subtração");
        calculadora.multiplicarDoisNumeros(60,50);
        System.out.println("Multiplicação finalizada");

    }
}
