package ClassesAbstratas.Empresa;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel",5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gabriel",100000);
        System.out.println(desenvolvedor);
    }
}
