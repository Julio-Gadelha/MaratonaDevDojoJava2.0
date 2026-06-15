package Polimorfismo.Forma.Test;


import Polimorfismo.Forma.Dominio.Circulo;
import Polimorfismo.Forma.Dominio.Quadrado;
import Polimorfismo.Forma.Dominio.Triangulo;
import Polimorfismo.Forma.Servico.CalcularFormula;


public class TestFigura {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Triangulo escaleno", 3, 3);
        Quadrado quadrado = new Quadrado("Quadrado", 4.5, 5);
        Circulo circulo = new Circulo("Circulo", 1, 3);

        CalcularFormula.calculaResultado(triangulo);
        System.out.println("------------------------");
        CalcularFormula.calculaResultado(quadrado);
        System.out.println("------------------------");
        CalcularFormula.calculaResultado(circulo);


    }
}
