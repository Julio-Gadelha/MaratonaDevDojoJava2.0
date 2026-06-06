package Polimorfismo.Servico;

import Polimorfismo.Dominio.Computador;
import Polimorfismo.Dominio.Tomate;

public class CalculadoraImposto {
    public void CalcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador" + computador.getNome());
        System.out.println("Valor" + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }
    public void CalcularImpostoComputador(Tomate tomate) {
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do Tomate" + tomate.getNome());
        System.out.println("Valor" + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }
}
