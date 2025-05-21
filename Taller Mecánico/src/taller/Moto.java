package taller;

public class Moto extends Vehiculo implements Reparable
{

    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void reparar() 
    {
        System.out.println("La moto " + marca + " esta siendo reparada.");
    }
    
}
