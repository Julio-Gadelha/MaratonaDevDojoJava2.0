package Polimorfismo.Empresa.Dominio;

public class Gerente extends Pessoa {

    public static final  double PORCENTAGEM = 0.21;

    public Gerente(String nome, double salario, Cargo cargo) {
        super(nome, salario, cargo);
    }

    @Override
    public double calcularSalario() {
        double SalarioFinal =  getSalario()+ (getSalario() * PORCENTAGEM);
        return SalarioFinal;
    }
}
