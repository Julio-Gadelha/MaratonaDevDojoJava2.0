package ClassesAbstratas.Hospital;

public class Medico extends   Person{
private Especialidade especialidade;

    public Medico(String name, String cpf, int age, Especialidade cirurgiao) {
        super(name, cpf, age);
    }

    public double realizarConsulta(Paciente paciente) {
        double valor = especialidade.getValorConsulta();
        if (paciente.isTemPlano()) {
            valor = valor * 0.80;
        }
        return valor;
    }


    @Override
    public String resumo() {
        return toString() +
                "\nEspecialidade: " + especialidade +
                "\nValor da consulta: R$" + String.format("%.2f", especialidade.getValorConsulta());
    }
}
