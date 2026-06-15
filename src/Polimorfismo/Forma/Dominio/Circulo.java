package Polimorfismo.Forma.Dominio;

public class Circulo  extends Formula {
    private double raio;

    public Circulo(String nome, double tamanho, double raio) {
        super(nome, tamanho);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
