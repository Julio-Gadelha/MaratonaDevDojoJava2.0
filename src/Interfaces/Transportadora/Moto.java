package Interfaces.Transportadora;

public class Moto extends Veiculo {

    public Moto(String placa, double capacidadeKg, Regiao regiao) {
        super(placa, capacidadeKg, regiao);
    }

    @Override
    public double calcularFrete(double peso) {
        return peso * getRegiao().getMultiplicador() * 1.0;
    }

    @Override
    public int prazoEntrega() {
        return 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n🏍️  Tipo: Moto" +
                "\n⏱️  Prazo de entrega: " + prazoEntrega() + " dias\n" +
                "══════════════════════════════";
    }
}