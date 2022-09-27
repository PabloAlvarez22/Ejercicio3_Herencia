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
public class Revista  extends LibroPadre {
    int anio;
    int numeroRevista;

    public Revista(int numeroIdentificacion, String titulo, String materia, int cantidadEjemplares, String estado, int anio, int numeroRevista) {
        super(numeroIdentificacion, titulo, materia, cantidadEjemplares, estado);
        this.anio = anio;
        this.numeroRevista = numeroRevista;
        
    }

    // Se crearon los getters y setters dependiendo de los atributos.
       
    
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    
    
    
}
