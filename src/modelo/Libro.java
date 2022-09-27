/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author PabloAlvarez 221082
 */
public class Libro extends LibroPadre {
    private String autor;
    private String editorial;

    public Libro(int numeroIdentificacion, String titulo, String materia, int cantidadEjemplares, String estado, String autor, String editorial) {
        super(numeroIdentificacion, titulo, materia, cantidadEjemplares, estado);
        this.autor = autor;
        this.editorial = editorial;
    }
    
    //Se crearon los getters y setters dependiendo de los atributos.
     
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    
    
    
}
