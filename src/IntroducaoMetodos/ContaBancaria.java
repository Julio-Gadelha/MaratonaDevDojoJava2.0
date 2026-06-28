package IntroducaoMetodos;

public class ContaBancaria {
    private String nome;
    private double saldo;


    public double depositar(double valor){
        double saldoFinal = saldo += valor;
        System.out.println("ContaBancaria : " + saldoFinal);
        return  saldoFinal;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nome : " + getNome()+ "\n" +
                "Saldo : " + getSaldo();
    }
}
