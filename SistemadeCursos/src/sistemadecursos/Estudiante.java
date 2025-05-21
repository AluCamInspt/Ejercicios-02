package sistemadecursos;

public class Estudiante extends Persona {

    private Curso curso;

    public Estudiante(String nombre, String apellido, int DNI, int legajo, Curso curso) {
        super(nombre, apellido, DNI, legajo);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + curso;
    }

}
