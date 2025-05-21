package biblioteca;

public class DVD extends MaterialBiblioteca
{
    private int duracion;
    
    public DVD(int duracion,String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.duracion=duracion;
    }
        @Override
    public void mostrar()
    {
        System.out.println("Duracion:"+duracion);
        super.mostrar();
    }
}
