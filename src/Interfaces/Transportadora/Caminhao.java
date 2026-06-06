package Interfaces.Transportadora;
    public class Caminhao extends Veiculo {

        public Caminhao(String placa, double capacidadeKg, Regiao regiao) {
            super(placa, capacidadeKg, regiao);
        }

        @Override
        public double calcularFrete(double peso) {
            double frete = peso * getRegiao().getMultiplicador() * 2.0;
            if (peso > 100) {
                frete = frete * 0.90; // 10% de desconto
                System.out.println("Desconto de 10% aplicado!");
            }
            return frete;
        }

        @Override
        public int prazoEntrega() {
            return 5;
        }

        @Override
        public String toString() {
            return super.toString() +
                    "\n🚚 Tipo: Caminhao" +
                    "\n⏱️  Prazo de entrega: " + prazoEntrega() + " dias\n" +
                    "══════════════════════════════";
        }
}

