package BlocosdeInicializacao;

public class Anime {
    private String nome;
    private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};


    public Anime(){
        for (int episodios: this.episodios) {
            System.out.print( episodios+ " ");
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public int[] getEpisodios() {
        return episodios;
    }


}
