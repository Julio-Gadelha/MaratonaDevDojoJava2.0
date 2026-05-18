package ModificadorEstatico.Test;

import ModificadorEstatico.Car;

public class CarroTest01 {
    public static void main(String[] args) {
    Car.setVelocidadeLimite(180);

        Car c1 = new Car("BMW",270);
        Car c2 = new Car("FERRARI",400);
        Car c3 = new Car("MERECEDES",290);





        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
