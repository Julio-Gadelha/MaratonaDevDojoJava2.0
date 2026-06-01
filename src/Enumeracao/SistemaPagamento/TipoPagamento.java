package Enumeracao.SistemaPagamento;

public enum TipoPagamento {
    PIX {
        @Override
        public double calcularPagamento(double preco, double quantidade) {
            double valorPagamento = preco * quantidade;
            return valorPagamento;
        }
    }, CREDITO {
        @Override
        public double calcularPagamento(double preco, double quantidade) {
            double valorPagamento = preco * quantidade;
            double valorFinal = valorPagamento * 0.05;
            double Pagamento = valorFinal + valorPagamento;
            return Pagamento;
        }
    },DEBITO{
        @Override
        public double calcularPagamento(double preco, double quantidade) {
            double valorPagamento = preco * quantidade;
            double valorFinal = valorPagamento * 0.01;
            double Pagamento = valorFinal + valorPagamento;
            return Pagamento;

        }
    },BOLETO{
        @Override
        public double calcularPagamento(double preco, double quantidade) {
            double valorPagamento = preco * quantidade;
            double valorFinal = valorPagamento * 0.02;
            double Pagamento = valorFinal + valorPagamento;
            return Pagamento;
        }
    };
    public abstract double calcularPagamento(double preco, double quantidade);

    }
