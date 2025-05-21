package biblioteca;


public class MaterialBiblioteca 
{
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public MaterialBiblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public void mostrar()
    {
        System.out.println("Titulo:"+titulo+"\nAutor:"+autor+"\nAnio de publicacion:"+anioPublicacion);
    }
}

