package Polimorfismo.Empresa.Servico;



import Polimorfismo.Empresa.Dominio.Pessoa;

public class CalculoEmpresa {
    public static void calculaResultado(Pessoa pessoa) {
        System.out.println("Relatório do salario da Empresa");
        double resultado = pessoa.calcularSalario();
        System.out.println("Nome  = " + pessoa.getNome());
        System.out.println("Cargo  = "  + pessoa);
        System.out.println("SalarioBruto  = " + pessoa.getSalario());
        System.out.println("Salario =  " + resultado );
    }
}
