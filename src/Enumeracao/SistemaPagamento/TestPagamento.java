package Enumeracao.SistemaPagamento;

public class TestPagamento {
    static void main(String[] args) {
        Pessoa  pessoa = new Pessoa("Abajur",30.69,2,TipoPagamento.BOLETO);
        System.out.println(pessoa);
    }
}
