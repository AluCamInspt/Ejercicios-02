package biblioteca;

public class Revista extends MaterialBiblioteca
{
  private int edicion;

    public Revista(int edicion,String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.edicion=edicion;
    }
      @Override
    public void mostrar()
    {
        System.out.println("Edicion:"+edicion);
        super.mostrar();
    }
}
