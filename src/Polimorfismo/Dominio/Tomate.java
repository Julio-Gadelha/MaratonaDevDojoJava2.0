package Polimorfismo.Dominio;

public class Tomate extends Produto {
    public static final  double IMPOSTOS_POR_CENTO = 0.6;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTOS_POR_CENTO;
    }
}
