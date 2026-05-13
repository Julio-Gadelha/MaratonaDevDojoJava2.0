package SistemaFuncionarios;

public class Gerente  extends  Funcionario implements Autenticavel{


    public Gerente(String nome, double salario, Nivel1 nivel1) {
        super(nome, salario, nivel1);
    }

    @Override
    double calcularBonus() {
        return salario * 0.30;
    }

    @Override
    public void fazerLogin() {
        System.out.println("Login do gerente realizado");
    }
}
