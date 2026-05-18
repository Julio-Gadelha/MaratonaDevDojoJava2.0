package HerencaDominio.Exercicio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
      double salarioFinal = salario + (salario * 0.20);
      return  salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
