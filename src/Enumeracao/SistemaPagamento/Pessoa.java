package Enumeracao.SistemaPagamento;

public class Pessoa {
    private String nomeProduto;
    private double preco;
    private double quantidade ;
    private TipoPagamento TipoPagamento;

    public Pessoa(String nomeProduto, double preco, double quantidade, TipoPagamento tipoPagamento) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
        TipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeProduto +
                "\nPreco unitario: R$" + String.format("%.2f", preco) +
                "\nQuantidade: " + quantidade +
                "\nForma de pagamento: " + TipoPagamento +
                "\nValor final: R$" + String.format("%.2f", TipoPagamento.calcularPagamento(preco, quantidade));
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public TipoPagamento getTipoPagamento() {
        return TipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        TipoPagamento = tipoPagamento;
    }
}
