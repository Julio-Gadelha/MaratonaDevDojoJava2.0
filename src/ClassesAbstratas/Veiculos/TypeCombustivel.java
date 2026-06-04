package ClassesAbstratas.Veiculos;

public enum TypeCombustivel {
    GASOLINA(0.70),
    ETANOL(0.50),
    ELETRICO(0.20),
    FLEX(0.60);

    private final double custoPorKm;

    TypeCombustivel(double custoPorKm) {
        this.custoPorKm = custoPorKm;
    }

    public double getCustoPorKm() {
        return custoPorKm;
    }

}
