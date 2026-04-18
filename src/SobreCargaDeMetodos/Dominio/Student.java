package SobreCargaDeMetodos.Dominio;

public class Student {
    private String name;
    private double nota;

    public void exibirNota(){
        System.out.println(this.name);
        System.out.println(this.nota);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 &&  nota <=10 ){
            this.nota = nota;
            return;
        }
        System.out.println("Nota invalida");


    }
}
