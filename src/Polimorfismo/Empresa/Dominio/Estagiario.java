package Polimorfismo.Empresa.Dominio;

public class Estagiario  extends Pessoa{
    public static final double PPORCENTAGEM = 0.10;

    public Estagiario(String nome, double salario, Cargo cargo) {
        super(nome, salario, cargo);
    }

    @Override
    public double calcularSalario() {
          double salrioFinal =  getSalario()   +(getSalario() * PPORCENTAGEM);
          return salrioFinal;
    }
}
