package HerencaDominio.exerciciosHeranca.Dominio;

public  abstract class Veiculo {
    protected  String modelo;
    protected  int ano;



    abstract void ligar();

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
