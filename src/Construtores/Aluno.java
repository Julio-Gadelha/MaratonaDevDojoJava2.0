package Construtores;

public class Aluno {

    private String name;
    private double nota;

    public Aluno(String name) {
        this.name = name;
    }

    public Aluno(String name, double nota) {
        this.name = name;
        this.nota = nota;
    }

    public void  MostrarDados(){
        System.out.println("Name : " + this.name);
        System.out.println("Note : " + this.nota);
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
        this.nota = nota;
    }
}
