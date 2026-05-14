package SobreCargaDeMetodos.Dominio;

public class Product {
    private String name;
    private double value;

    public void exibirProduto(){
        System.out.println(this.name);
        System.out.println(this.value);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
