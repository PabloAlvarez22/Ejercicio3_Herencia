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
public class Articulo  extends LibroPadre {
    String arbitro;
    
    public Articulo(int numeroIdentificacion, String titulo, String materia, int cantidadEjemplares, String estado, String arbitro) {
        super(numeroIdentificacion, titulo, materia, cantidadEjemplares, estado);
        
        this.arbitro = arbitro;
    }
    
    //Se crearon los getters y setters dependiendo de los atributos. 

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }
    
    
    
}
