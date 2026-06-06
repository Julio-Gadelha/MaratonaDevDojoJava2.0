package HerencaDominio.Test01;

import HerencaDominio.Dominio.Endereco;
import HerencaDominio.Dominio.Funcionario;
import HerencaDominio.Dominio.Pessoa;

public class TestHeranca {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Avenida dali");
        endereco.setCep("33812648");

        Pessoa pessoa = new Pessoa("Julio Gabriel");


        pessoa.setCpf("284672t7r58");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Gadelha vosky");

        funcionario.setCpf("0193083917386");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(7000.00);

    }
}
