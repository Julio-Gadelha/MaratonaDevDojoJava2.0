package AssociacaoDeDominio.Test02;

import AssociacaoDeDominio.Dominio.Jogador;
import AssociacaoDeDominio.Dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Toti");
        Time time = new Time("Seleção brasileira");

        jogador1.setTime(time);
    }
}
