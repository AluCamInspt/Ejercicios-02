package tiendaonline;
public class Ropa extends Producto 
{

    public Ropa(String nombre, double precioBase, String marca, double descuento) {
        super(nombre, precioBase, marca, descuento);
    }
    
    public double calcularPrecioFinal() {
        return precioBase ;
    }
}
