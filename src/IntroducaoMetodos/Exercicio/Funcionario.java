package IntroducaoMetodos.Exercicio;

public class Funcionario {
    public String nome;
    public int idade ;
     public double [] salario;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
        for(double salario : salario){
            System.out.println(salario + " ");
        }
    }
}
