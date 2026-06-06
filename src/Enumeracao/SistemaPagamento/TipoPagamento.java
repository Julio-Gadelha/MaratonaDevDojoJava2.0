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
            double valorFinal = valorPagamento + (valorPagamento * 0.05);
            return valorFinal;
        }
    }, DEBITO {
        @Override
        public double calcularPagamento(double preco, double quantidade) {
            double valorPagamento = preco * quantidade;
            double valorFinal = (valorPagamento * 0.01);
            return valorFinal;
        }
    }, BOLETO {
        @Override
        public double calcularPagamento(double preco, double quantidade) {
            double valorPagamento = preco * quantidade;
            double valorFinal =   valorPagamento +(valorPagamento * 0.02);
            return  valorFinal;

        }
    };

    public abstract double calcularPagamento(double preco, double quantidade);

}
