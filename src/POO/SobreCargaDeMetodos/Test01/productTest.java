package SobreCargaDeMetodos.Test01;

import SobreCargaDeMetodos.Dominio.Product;

public class productTest {
    public static void main(String[] args) {
        Product product = new Product();

        product.setName("Mouse");
        product.setValue(190.50);
        product.exibirProduto();
    }
}
