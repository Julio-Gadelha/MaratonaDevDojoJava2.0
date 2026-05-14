package IntroducaoaClasses.TestPessoa;

import IntroducaoaClasses.Carro;

public class TestCarro {
    public static void main(String[] args) {
        Carro Tesla = new Carro();
        Tesla.marca = "Tesla";
        Tesla.modelo = "Y";
        Tesla.ano = 2026;

        System.out.println(Tesla.marca);
        System.out.println(Tesla.modelo);
        System.out.println(Tesla.ano);




    }
}
