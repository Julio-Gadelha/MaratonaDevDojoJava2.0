package IntroducaoMetodos.Exercicio.Tests;

import IntroducaoMetodos.Exercicio.Funcionario;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome ="Gabriel";
        funcionario.idade = 18;
        funcionario.salario = new double[]{3000,5000,7000};
    }
}
