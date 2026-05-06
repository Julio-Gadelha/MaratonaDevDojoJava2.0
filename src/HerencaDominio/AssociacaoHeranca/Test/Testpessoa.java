package HerencaDominio.AssociacaoHeranca.Test;

import HerencaDominio.AssociacaoHeranca.Endereco;
import HerencaDominio.AssociacaoHeranca.Pessoa;

public class Testpessoa {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Avenida horacle união ");
        endereco.setCep("02948248");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gabriel");
        pessoa.setCpf("2846274609");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gabriel");
        funcionario.setCpf("358368");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(7000.00);
        System.out.println("---------------");
        funcionario.imprime();
    }
}
