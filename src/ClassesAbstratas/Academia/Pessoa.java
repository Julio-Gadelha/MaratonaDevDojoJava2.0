package ClassesAbstratas.Academia;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private Modalidade modalidade;
    private double saldo;

    public Pessoa(String nome, String cpf, int idade, Modalidade modalidade, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.modalidade = modalidade;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", modalidade=" + modalidade +
                ", saldo=" + saldo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            System.out.println("Saldo baixo");
            return;
        }
        this.saldo = saldo;
    }
}
