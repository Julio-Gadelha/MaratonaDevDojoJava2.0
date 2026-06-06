package Interfaces.SistemaPagamento;

public enum TipoPagamento {
    PIX(0.99),
    BOLETO(2.0),
    CREDITO(5.0);

    private final double taxa;

    TipoPagamento(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public double calcularPagemento(double valor) {
        return valor + (valor * taxa / 100);
    }
}
