package ClassesAbstratas.Veiculos;

public abstract class Veiculo {
    private String brand;
    private String model;
    private String age;
    private TypeCombustivel typeCombustivel;

    public Veiculo(String brand, String model, String age, TypeCombustivel typeCombustivel) {
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.typeCombustivel = typeCombustivel;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", age='" + age + '\'' +
                ", typeCombustivel=" + typeCombustivel +
                '}';
    }

    public abstract double calcularCustoViagem(int km);

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public TypeCombustivel getTypeCombustivel() {
        return typeCombustivel;
    }

    public void setTypeCombustivel(TypeCombustivel typeCombustivel) {
        this.typeCombustivel = typeCombustivel;
    }
}
