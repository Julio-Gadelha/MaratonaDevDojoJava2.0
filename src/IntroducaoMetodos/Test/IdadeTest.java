package IntroducaoMetodos.Test;

import IntroducaoMetodos.Idade;

public class IdadeTest {
    public static void main(String[] args) {
        Idade idade = new Idade();
        idade.setNome("Gabriel");
        idade.setIdade(2);
        if (idade.getIdade() > 0) {
            System.out.println(idade);
        }
    }
}
