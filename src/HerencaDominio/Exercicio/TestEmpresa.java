package HerencaDominio.Exercicio;

public class TestEmpresa {
    public static void main(String[] args) {
        Gerente g = new Gerente("Carlos", 5000);
        Desenvolvedor d = new Desenvolvedor("Ana", 3000);

        System.out.println("Gerente: " + g.nome);
        System.out.println("Salário: " + g.salario);
        System.out.println("Bônus: " + g.calcularBonus());

        System.out.println("---------------------");

        System.out.println("Desenvolvedor: " + d.nome);
        System.out.println("Salário: " + d.salario);
        System.out.println("Bônus: " + d.calcularBonus());
        System.out.println(g);
        System.out.println(d);
    }

}
