package IntroducaoaClasses.TestPessoa;

import IntroducaoaClasses.Pessoa;

public class TestPessoa {
 public   static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Gabriel";
        pessoa.idade = 18;
        pessoa.sexo = 'M';

     System.out.println(pessoa.nome);
     System.out.println(pessoa.idade);
     System.out.println(pessoa.sexo);


    }
}
