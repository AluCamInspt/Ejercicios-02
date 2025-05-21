
package tiendaonline;

import java.util.ArrayList;

public class CarritoDeCompras {
    private ArrayList<Producto> productos;

    public CarritoDeCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecioFinal();
        }
        //Suma todos los precios dados
        return total;
    }

    public void mostrarDetalle() {
        for (Producto p : productos) {
            System.out.println("Producto:" + p.getNombre() + " (" + p.getMarca() + ")\nPrecio:$" + p.calcularPrecioFinal());
            System.out.println("--------------------------------");
        }
        System.out.println("TOTAL: $" + calcularTotal());
        //Llama
    }
}