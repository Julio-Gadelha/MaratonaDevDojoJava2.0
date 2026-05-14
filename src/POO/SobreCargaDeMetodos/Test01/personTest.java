package SobreCargaDeMetodos.Test01;

import SobreCargaDeMetodos.Dominio.Person;

public class personTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Gabriel");
        person.setAge(18);
        person.imprime();

    }
}
