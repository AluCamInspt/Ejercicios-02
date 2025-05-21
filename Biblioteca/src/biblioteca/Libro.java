package biblioteca;

public class Libro extends MaterialBiblioteca{
    private int ISBN;

    public Libro(int ISBN,String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.ISBN=ISBN;
    }
    @Override
    public void mostrar()
    {
        System.out.println("ISBN:"+ISBN);
        super.mostrar();
    }
}
