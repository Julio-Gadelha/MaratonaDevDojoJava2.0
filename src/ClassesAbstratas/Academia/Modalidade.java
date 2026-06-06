package ClassesAbstratas.Academia;

public enum Modalidade {
    MUSCULACAO{
        @Override
        public double calcularMensalidade(double saldo) {
            double valorPagamento = saldo - 60.99;
            return valorPagamento;
        }
    },NATACAO{
        @Override
        public double calcularMensalidade(double saldo) {
            double valorPagamento = saldo  -100;
            return valorPagamento;
        }
    },CROSSFIT{
        @Override
        public double calcularMensalidade(double saldo) {
            double valorPagamento = saldo  - 80.81;
            return valorPagamento;
        }
    };

    public abstract double calcularMensalidade(double saldo);
}
