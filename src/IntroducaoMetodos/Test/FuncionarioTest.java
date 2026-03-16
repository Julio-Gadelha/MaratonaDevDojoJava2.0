package IntroducaoMetodos.Test;

import IntroducaoMetodos.Funcionario;

public class FuncionarioTest {
  public   static void main(String[] args) {
      Funcionario funcionario = new Funcionario();
      funcionario.setNome("Gabriel");
      funcionario.setIdade(19);
      funcionario.setSalarios(new double[]{2300,349.88,4000});
      System.out.println(funcionario);
    }
}
