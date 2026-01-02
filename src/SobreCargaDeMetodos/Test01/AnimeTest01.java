package SobreCargaDeMetodos.Test01;

import SobreCargaDeMetodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
     Anime anime = new Anime();
     anime.setNome("Naruto");
     anime.setTipo("TV");
     anime.setEpisodios(977);
     anime.imprimi();
    }
}
