package IntroducaoMetodos.Test;

import IntroducaoMetodos.Estudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Gabriel";
        estudante.idade = 19;
        estudante.sexo = 'M';



        estudante.nome = "Luffy";
        estudante.idade = 19;
        estudante.sexo = 'M';


        estudante.imprime();
        estudante.imprime();




    }
}
