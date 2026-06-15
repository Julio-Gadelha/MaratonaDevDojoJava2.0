package Polimorfismo.Servico;


import Polimorfismo.Dominio.Produto;


public class CalculadoraImposto  {
    public static  void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto do computador");
        double imposto = produto.calcularImposto();
        System.out.println(" Produto  =  " + produto.getNome());
        System.out.println("Valor = " + produto.getValor());
        System.out.println("Imposto a ser pago =  " + imposto);
    }
}
