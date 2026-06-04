package ModificadorEstatico;

public class Car {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Car(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime() {
        System.out.println("-----------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Maxima " + this.velocidadeMaxima);
        System.out.println("Velociade Limite " + Car.velocidadeLimite);

    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Car.velocidadeLimite = velocidadeLimite;
    }
    public double getVelocidadeLimite(){
        return Car.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
