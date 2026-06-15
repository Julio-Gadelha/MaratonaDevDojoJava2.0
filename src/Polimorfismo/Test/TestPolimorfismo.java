package Polimorfismo.Test;

import Polimorfismo.Dominio.Computador;
import Polimorfismo.Dominio.Televisao;
import Polimorfismo.Dominio.Tomate;
import Polimorfismo.Servico.CalculadoraImposto;

public class TestPolimorfismo {
    public static void main(String[] args) {
        Computador computador = new Computador("c2", 34.07);
        Tomate tomate = new Tomate("Tomate", 2.50);
        Televisao tv = new Televisao("Sansung", 4000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tv);


    }
}
