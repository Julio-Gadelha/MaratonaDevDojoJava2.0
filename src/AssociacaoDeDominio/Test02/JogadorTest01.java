package AssociacaoDeDominio.Test02;


import Domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Cr7");
        Jogador jogador3 = new Jogador("Messi");
        Jogador[]jogadores = {jogador1,jogador2,jogador3};

        // For each
        for (Jogador jogador : jogadores) {
           jogador.imprime();
        }

    }
}
