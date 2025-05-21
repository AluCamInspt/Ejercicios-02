package taller;
public class Main {

    public static void main(String[] args) {
        Reparable auto1 = new Auto("Toyota");
        Reparable moto1 = new Moto("Yamaha");

        auto1.reparar();
        moto1.reparar();

        System.out.println("\nReparando todos los vehículos:");
        Reparable[] vehiculos = {
            new Auto("Ford"),
            new Moto("Honda"),
            new Auto("Chevrolet"),
            new Moto("Suzuki")
        };

        for (Reparable v : vehiculos) {
            v.reparar();
        }
    }
}
