package Polimorfismo.Forma.Dominio;

public class Triangulo  extends Formula {
    private double base ;


    @Override
    public double calcularArea() {
        double area = (base * getTamanho()) /2;
        return area;
    }

    public Triangulo(String nome, double tamanho, double base) {
        super(nome, tamanho);
        this.base = base;
    }
}
