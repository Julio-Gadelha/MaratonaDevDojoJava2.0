package Interfaces.SistemaPagamento;

public abstract class Conta {
    private String titular;
    private double saldo;
    private TipoPagamento tipoPagamento;

    public Conta(String titular, double saldo, TipoPagamento tipoPagamento) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoPagamento = tipoPagamento;
    }@Override
    public String toString() {
        return "╔══════════════════════════════╗\n" +
                "        RESUMO DO PAGAMENTO      \n" +
                "╚══════════════════════════════╝\n" +
                "👤 Titular: " + titular + "\n" +
                "💰 Saldo: R$" + String.format("%.2f", saldo) + "\n" +
                "💳 Forma de pagamento: " + tipoPagamento + "\n" +
                "📊 Taxa: " + tipoPagamento.getTaxa() + "%\n" +
                "✅ Valor final: R$" + String.format("%.2f", tipoPagamento.calcularPagemento(saldo)) + "\n" +
                "══════════════════════════════";
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

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
