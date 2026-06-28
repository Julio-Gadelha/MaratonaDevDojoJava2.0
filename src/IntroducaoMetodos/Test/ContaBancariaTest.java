package IntroducaoMetodos.Test;

import IntroducaoMetodos.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
      contaBancaria.setNome("Gabriel");
      contaBancaria.depositar(500);
        System.out.println(contaBancaria);
    }
}
