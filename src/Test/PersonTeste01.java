package Test;

import IntroducaoMetodos.Person;

public class PersonTeste01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Gabriel");
        person.setAge(-1);
        System.out.println(person);
    }
}
