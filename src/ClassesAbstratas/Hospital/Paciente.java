package ClassesAbstratas.Hospital;

public class Paciente  extends  Person{
    private boolean temPlano;

    public Paciente(String nome, String cpf, int idade, boolean temPlano) {
        super(nome, cpf, idade);
        this.temPlano = temPlano;
    }

    @Override
    public String resumo() {
        return toString() +
                "\nPlano de saude: " + (temPlano ? "Sim" : "Nao");
    }

    public boolean isTemPlano() { return temPlano; }
    public void setTemPlano(boolean temPlano) { this.temPlano = temPlano; }
}

