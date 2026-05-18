package Interfaces.Exercicio1;

public class TestEmpresa {
    public static void main(String[] args) {
        Progamador progamador = new Progamador();
        progamador.setNome("Gabriel");
        progamador.setCargo(Cargo.PROGAMADOR);
        progamador.setSalario(1000);
        progamador.executarTrabalho();
        System.out.println(progamador);
    }
}
