package ClassesAbstratas.Hospital;

public enum Especialidade {
    CLINICO(150.0),
    PEDIATRA(200.0),
    CIRURGIAO(500.0);

    private final double valorConsulta;

    Especialidade(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }


}
