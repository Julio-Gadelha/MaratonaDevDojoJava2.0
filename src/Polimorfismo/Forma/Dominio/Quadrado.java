package Polimorfismo.Forma.Dominio;

public class Quadrado  extends Formula {
    private int lado;

    public Quadrado(String nome,  double tamanho, int lado) {
        super(nome, tamanho);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }
}
