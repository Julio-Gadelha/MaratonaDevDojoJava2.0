package Polimorfismo.Dominio;

public class Televisao  extends Produto{
    public static final  double IMPOSTOS_POR_CENTO = 0.25;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTOS_POR_CENTO;
    }
}
