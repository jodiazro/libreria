/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

/**
 *
 * @author Estudiante
 */
public class PruebaLibro {
    public static void main(String[] args) {
        ConjuntoLibros biblioteca=new ConjuntoLibros(10);
        biblioteca.agregarLibro(new Libro("Moby Dick",300,new Autor("Charles","Dickens")));
        biblioteca.agregarLibro(new Libro("Scorpio City",280,new Autor("Mario","Mendoza")));
        biblioteca.eliminarLibro(new Autor("Mario","Mendoza"));
        biblioteca.eliminarLibro("Moby Dick");
        biblioteca.agregarLibro(new Libro("Cien años de soledad",300,new Autor("Gabriel","García Marquez")));
        for(int i=0;i<biblioteca.getLibros().length;i++){
            Libro tal_libro=biblioteca.getLibros()[i];
            System.out.println(tal_libro.getTitulo());
        }
        
    }
}
