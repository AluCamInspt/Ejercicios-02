package sistemadecursos;

public class Persona {

    private String nombre;
    private String apellido;
    private int DNI;
    private int legajo;

    public Persona(String nombre, String apellido, int DNI, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\nApellido:" + apellido + "\nDNI:" + DNI + "\nLegajo:" + legajo;
    }
}
