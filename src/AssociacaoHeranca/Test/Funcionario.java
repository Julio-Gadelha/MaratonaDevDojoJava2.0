package AssociacaoHeranca.Test;
import AssociacaoHeranca.Pessoa;


public class Funcionario extends Pessoa {
private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
