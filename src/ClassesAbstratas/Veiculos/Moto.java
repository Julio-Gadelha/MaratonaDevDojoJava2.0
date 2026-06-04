package ClassesAbstratas.Veiculos;

public class Moto extends  Veiculo{

    public Moto(String brand, String model, String age, TypeCombustivel typeCombustivel) {
        super(brand, model, age, typeCombustivel);
    }

    @Override
    public double calcularCustoViagem(int km) {
        return km * getTypeCombustivel().getCustoPorKm() *0.8;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nCusto para 100km: R$" + String.format("%.2f", calcularCustoViagem(100));
    }

}
