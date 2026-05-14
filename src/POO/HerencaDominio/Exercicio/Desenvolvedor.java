package HerencaDominio.Exercicio;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        double salarioFinal = salario + (salario * 0.10);
        return salarioFinal;
    }
}
