package ClassesAbstratas.Veiculos;

public class Carro extends Veiculo {

    public Carro(String brand, String model, String age, TypeCombustivel typeCombustivel) {
        super(brand, model, age, typeCombustivel);
    }

    @Override
    public double calcularCustoViagem(int km) {
        return   km * getTypeCombustivel().getCustoPorKm();

    }
    @Override
    public String toString() {
        return super.toString() +
                "\nCusto para 100km: R$" + String.format("%.2f", calcularCustoViagem(100));
    }

}
