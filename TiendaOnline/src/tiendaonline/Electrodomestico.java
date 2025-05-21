package tiendaonline;

public class Electrodomestico extends Producto{

    public Electrodomestico(String nombre, double precioBase, String marca, double descuento) {
        super(nombre, precioBase, marca, descuento);
    }
    
    public double calcularPrecioFinal() {
        return precioBase -((precioBase*descuento)/100);
        //Precio original - el precio descontado
    }
}
