package Interfaces.Transportadora;

public class TestTransportadora {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("ABC-1234", 500, Regiao.SUDESTE);
        Moto moto = new Moto("XYZ-5678", 50, Regiao.NORDESTE);

        double peso = 150.0;

        System.out.println(caminhao);
        System.out.printf("📦 Frete para %.1fkg: R$%.2f%n", peso, caminhao.calcularFrete(peso));

        System.out.println();

        System.out.println(moto);
        System.out.printf("📦 Frete para %.1fkg: R$%.2f%n", peso, moto.calcularFrete(peso));
    }
}

