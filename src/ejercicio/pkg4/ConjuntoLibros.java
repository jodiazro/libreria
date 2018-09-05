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
public class ConjuntoLibros {
    //Asociacion cardinalidad 10
    private Libro[] libros;

    public ConjuntoLibros(int n) {
        //Liberando memoria
        this.libros = new Libro[n];
    }
    
    public boolean agregarLibro(Libro libro){
        for(int i=0;i<10;i++){
            if(this.libros[i]==null){
                this.libros[i]=libro;
                return true;
            }
        }
        return false;
    } 
    
    public boolean eliminarLibro(String titulo){
        for(int i=0;i<this.libros.length;i++){
            if(this.libros[i].getTitulo().equals(titulo)){
                this.libros[i]=null;
                return true;
              }
        }
        return false;
    }
    
    public boolean eliminarLibro(Autor autor){
        for(int i=0;i<this.libros.length;i++){
            if(this.libros[i].getAutor().getApellido().equals(autor.getApellido()) && this.libros[i].getAutor().getNombre().equals(autor.getNombre())){
                this.libros[i]=null;
                return true;
            }
        }
        return false;
    }
    
    public Libro obtenerMejorValorado(){
        Libro mejorv=this.libros[1];
        for(int i=0;i<this.libros.length-1;i++){
            if(mejorv.getCalificacion()<this.libros[i+1].getCalificacion()){
                mejorv=this.libros[i+1];
            }
        }
        return mejorv;
    }
    
    public Libro obtenerPeorValorado(){
        Libro mejorv=this.libros[1];
        for(int i=0;i<this.libros.length-1;i++){
            if(mejorv.getCalificacion()>this.libros[i+1].getCalificacion()){
                mejorv=this.libros[i+1];
            }
        }
        return mejorv;
    }

    public Libro[] getLibros() {
        return libros;
    }
        
}
    
    
    

