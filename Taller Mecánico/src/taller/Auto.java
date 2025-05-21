
package taller;

public class Auto extends Vehiculo implements Reparable
{

    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void reparar() 
    {
        System.out.println("El auto " + marca + " esta siendo reparado.");
    }
    
}
