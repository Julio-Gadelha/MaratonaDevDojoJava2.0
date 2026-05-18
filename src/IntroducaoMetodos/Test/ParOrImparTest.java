package IntroducaoMetodos.Test;

import IntroducaoMetodos.ParOrImpar;

import static IntroducaoMetodos.ParOrImpar.ehPar;

public class ParOrImparTest {
    public static void main(String[] args) {
        ParOrImpar  x = new ParOrImpar();
        boolean resultado;

        resultado = ehPar(4);

        System.out.println(resultado);
    }
}
