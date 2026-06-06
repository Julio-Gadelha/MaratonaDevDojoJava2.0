package Interfaces.Exercicio1;

public class Progamador  extends Funcionario implements  Trabalho{

    @Override
    public void executarTrabalho() {
        System.out.println("Sou progamador e faço computarias ");
    }
}
