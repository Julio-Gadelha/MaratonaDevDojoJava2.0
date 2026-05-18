package Construtores;

public class Product {
    private String name;
    private  double value ;

    public Product(String name) {
        this.name = name;
        this.value = 0.0;
    }

    public void exibirProduct(){
        System.out.println("Nome: " + this.name);
        System.out.println("Preço: " + this.value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
