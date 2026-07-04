package Exercicios;

import java.util.ArrayList;

public class TestAnimais {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Bob",3));
        animais.add(new Gato("Garfilfd",12));
        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}
