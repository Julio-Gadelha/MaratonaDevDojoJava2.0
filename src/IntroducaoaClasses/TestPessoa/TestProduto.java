package IntroducaoaClasses.TestPessoa;

import IntroducaoaClasses.Produto;

public class TestProduto {
    public static void main(String[] args) {
        Produto Rice= new Produto();

        Rice.name = "Rice";
        Rice.amount = 3;
        Rice.value = 4.0;

        System.out.println(Rice.name);
        System.out.println(Rice.amount);
        System.out.println(Rice.value);

    }
}
