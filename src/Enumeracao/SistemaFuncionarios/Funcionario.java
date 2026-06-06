package Enumeracao.SistemaFuncionarios;

public abstract class Funcionario {
    private String nome;
    protected double salario;
    Nivel1 nivel1;

    public Funcionario(String nome, double salario, Nivel1 nivel1) {
        this.nome = nome;
        this.salario = salario;
        this.nivel1 = nivel1;
    }

    abstract double calcularBonus();

    public void exibirDados() {
        System.out.println(" Nome : " + this.nome);
        System.out.println(" Salario : " + this.salario);
        System.out.println(" Nivel : " + this.nivel1);

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", nivel1=" + nivel1 +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Nivel1 getNivel1() {
        return nivel1;
    }

    public void setNivel1(Nivel1 nivel1) {
        this.nivel1 = nivel1;
    }
}
