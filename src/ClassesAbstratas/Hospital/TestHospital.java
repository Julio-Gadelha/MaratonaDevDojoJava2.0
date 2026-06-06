package ClassesAbstratas.Hospital;

import java.util.ArrayList;
import java.util.List;

public class TestHospital {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Ana Silva", "123.456.789-00", 30, true);
        Paciente p2 = new Paciente("Carlos Souza", "987.654.321-00", 45, false);

        Medico m1 = new Medico("Dr. Pedro", "111.222.333-00", 40, Especialidade.CLINICO);
        Medico m2 = new Medico("Dra. Julia", "444.555.666-00", 35, Especialidade.CIRURGIAO);






    }
}
