package Interfaces.Transportadora;

public abstract class Veiculo {
    private String placa;
    private double capacidadeKg;
    private Regiao regiao;

    public Veiculo(String placa, double capacidadeKg, Regiao regiao) {
        this.placa = placa;
        this.capacidadeKg = capacidadeKg;
        this.regiao = regiao;
    }

    public abstract double calcularFrete(double peso);

    public abstract int prazoEntrega();

    @Override
    public String toString() {
        return "╔══════════════════════════════╗\n" +
                "         DADOS DO VEICULO        \n" +
                "╚══════════════════════════════╝\n" +
                "🚛 Placa: " + placa + "\n" +
                "⚖️  Capacidade: " + capacidadeKg + "kg\n" +
                "📍 Regiao: " + regiao + "\n" +
                "══════════════════════════════";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeKg() {
        return capacidadeKg;
    }

    public void setCapacidadeKg(double capacidadeKg) {
        this.capacidadeKg = capacidadeKg;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }
}
