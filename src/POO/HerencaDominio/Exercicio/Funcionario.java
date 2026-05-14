package HerencaDominio.Exercicio;

public  abstract class Funcionario {
    protected String nome;
    protected  double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    abstract double calcularBonus();


    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Salário: " + salario +
                ", Bônus: " + calcularBonus();
    }
}
