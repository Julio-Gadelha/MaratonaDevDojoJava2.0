package IntroducaoMetodos;

public class Idade {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        if (idade <= 0){
            System.out.println("Idade invalidade !");
        }
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "Nome : " + getNome() + " \n" +
                "Idade = " + getIdade();
    }
}
