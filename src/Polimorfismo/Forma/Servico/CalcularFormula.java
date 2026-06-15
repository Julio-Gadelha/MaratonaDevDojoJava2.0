package Polimorfismo.Forma.Servico;

import Polimorfismo.Forma.Dominio.Formula;

public class CalcularFormula {
    public static void calculaResultado(Formula formula) {
        System.out.println("Relatório de Cálculo das figuras geométricas");
        double resultado = formula.calcularArea();
        System.out.println("Figura  = " + formula.getNome());
        System.out.println("Area  = " + resultado);
    }
}
