package IntroducaoMetodos;

import javax.xml.transform.Source;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("Idade Invalida");
            return;
        }
        this.age = age;
    }

    public int getAge() {

        return age;
    }


    public String toString() {
        return "HI, my name is " + getName() + " and I have " + getAge() + " Years old";
    }

}
