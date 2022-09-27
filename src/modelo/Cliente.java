
package modelo;

import java.util.ArrayList;

public class Cliente {
    private int numeroIdentidad;
    private String nombre;
    private String direccion;
    private int cantidadPublicaciones;
    private ArrayList<LibroPadre> librosPrestados = new ArrayList();
    
    //Se crearon los getters y setters dependiendo de los atributos.   
    
    public int getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(int numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadPublicaciones() {
        return cantidadPublicaciones;
    }

    public void setCantidadPublicaciones(int cantidadPublicaciones) {
        this.cantidadPublicaciones = cantidadPublicaciones;
    }

    public Cliente(int numeroIdentidad, String nombre, String direccion, int cantidadPublicaciones) {
        this.numeroIdentidad = numeroIdentidad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadPublicaciones = cantidadPublicaciones;
        
    }

    public ArrayList<LibroPadre> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(LibroPadre librosPrestado) {
        this.librosPrestados.add(librosPrestado);
    }
    
    
}
