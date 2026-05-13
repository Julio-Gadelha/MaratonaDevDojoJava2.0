package SistemaFuncionarios;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel",7000.00,Nivel1.JUNIOR);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Julio",90000.00,Nivel1.PLENO);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
