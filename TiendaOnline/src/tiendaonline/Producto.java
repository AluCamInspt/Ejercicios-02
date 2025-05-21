
package tiendaonline;
public abstract class Producto implements Vendible 
{
    protected String nombre;
    protected double precioBase;
    protected String marca;
    protected double descuento;

    public Producto(String nombre, double precioBase, String marca, double descuento) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.marca = marca;
        this.descuento = descuento;
    }
   
    @Override
    public double calcularPrecioFinal() {
        return precioBase * (1 - descuento);
        //(1 - descuento) calcula la parte del precioBase que se paga
    }
    public String getNombre() {
    return nombre;
    }

    public double getPrecioBase() {
    return precioBase;
    }

    public String getMarca() {
    return marca;
    }
}
