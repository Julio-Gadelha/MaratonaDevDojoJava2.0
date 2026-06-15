package Polimorfismo.Forma.Dominio;

public abstract class Formula  implements Forma {
    private String nome;
    private double tamanho;

    public Formula(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public abstract double calcularArea() ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
