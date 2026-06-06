package Interfaces.Transportadora;

public enum Regiao {
    NORTE(2.0),
    SUL(1.5),
    SUDESTE(1.0),
    NORDESTE(1.8);

    private final double multiplicador;

    Regiao(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

}