package Enumeracao.Exercise;

public class DIA {
    private   DiaSemana diaSemana;

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    @Override
    public String toString() {
        return "DIA{" +
                "diaSemana=" + diaSemana +
                '}';
    }
}
