package Interfaces.SistemaPagamento;



public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, double saldo, TipoPagamento tipoPagamento) {
        super(titular, saldo, tipoPagamento);
    }

    public void processarPagamento(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        setSaldo(getSaldo() - valor);
        System.out.println("Pagamento de R$" + String.format("%.2f", valor) + " processado via " + getTipoPagamento());
    }
}