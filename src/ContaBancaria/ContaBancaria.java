package ContaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    private static int proximoNumero = 1;

    public ContaBancaria(String titular, double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = 0;
        this.numeroConta = proximoNumero;
        proximoNumero++;
    }
public double depositar(double saldo,double depositar) {
        if (depositar <= 0){
            System.out.println("Valor invalido");
        }
        return saldo;
}
    public double sacar(double saldo,double sacar) {
        if (saldo < sacar){
            System.out.println("Não pode sacar");
        }
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public static int getProximoNumero() {
        return proximoNumero;
    }

    public static void setProximoNumero(int proximoNumero) {
        ContaBancaria.proximoNumero = proximoNumero;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroConta=" + numeroConta +
                '}';
    }

}
