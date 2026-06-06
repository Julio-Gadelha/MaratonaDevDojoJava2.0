package Enumeracao.SistemaFuncionarios;

public class Desenvolvedor  extends Funcionario implements Autenticavel{

    public Desenvolvedor(String nome, double salario, Nivel1 nivel1) {
        super(nome, salario, nivel1);
    }

    @Override
    double calcularBonus() {

        if (nivel1 == Nivel1.JUNIOR) {
            return salario * 0.10;

        } else if (nivel1 == Nivel1.PLENO) {
            return salario * 0.15;

        } else {
            return salario * 0.20;
        }
    }

    @Override
    public void fazerLogin() {
        System.out.println("Login do desenvolvedor realizado");
    }
}
