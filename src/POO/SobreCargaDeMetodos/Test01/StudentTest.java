package SobreCargaDeMetodos.Test01;

import SobreCargaDeMetodos.Dominio.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("felp");
        student.setNota(5);
        student.exibirNota();
    }
}
