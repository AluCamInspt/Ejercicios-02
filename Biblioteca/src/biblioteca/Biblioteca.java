package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    public static void main(String[] args) 
    {
        ArrayList <MaterialBiblioteca> materiales = new ArrayList();

        // Libros
        materiales.add(new Libro(1001, "Cien años de soledad", "Gabriel García Márquez", 1967));
        materiales.add(new Libro(1002, "El Hobbit", "J.R.R. Tolkien", 1937));
        materiales.add(new Libro(1003, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605));

        // Revistas
        materiales.add(new Revista(1, "Muy Interesante", "Varios autores", 2023));
        materiales.add(new Revista(2, "National Geographic", "Varios autores", 2022));
        materiales.add(new Revista(3, "Scientific American", "Varios autores", 2021));

        // DVDs
        materiales.add(new DVD(120, "El Señor de los Anillos", "Peter Jackson", 2001));
        materiales.add(new DVD(90, "Inception", "Christopher Nolan", 2010));
        materiales.add(new DVD(85, "Wall-E", "Andrew Stanton", 2008));
        
        for (MaterialBiblioteca material : materiales) {
            material.mostrar();
            System.out.println("------------");
        }

    }
 }
