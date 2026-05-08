package SobreCargaDeMetodos.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios(int i) {
        return episodios;
    }

}
