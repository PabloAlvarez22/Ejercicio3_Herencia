/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Libro;
import modelo.Revista;
import modelo.LibroPadre;


/**
 *
 * @author PabloAlvarez 221082
 */
public class EjercicioControlador {
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Libro> libros = new ArrayList();
    private ArrayList<Revista>revistas = new ArrayList();
    private ArrayList<Articulo>articulos = new ArrayList();
    
// Método para guardar cliente     
    public boolean guardarCliente(Cliente cliente){
        boolean flag= false;
        try{
            clientes.add(cliente);
            flag = true;
        }catch(Exception ex){
            System.out.println("ALGO MALO HA OCURRIDO");
            
        }
        
        
        return flag;
    }
    
 // Método para guardar libro    
    
    public boolean guardarLibro(Libro libro){
        boolean flag= false;
        
         try{
            libros.add(libro);
            flag = true;
        }catch(Exception ex){
            System.out.println("ALGO MALO HA OCURRIDO");
            
        }
        
        
        return flag;
    }
    
 // Método para guardar revistas  
    
    public boolean guardarRevista(Revista revista){
        boolean flag= false;
        
         try{
            revistas.add(revista);
            flag = true;
        }catch(Exception ex){
            System.out.println("ALGO MALO HA OCURRIDO");
            
        }
        
        
        return flag;
    }
    
//Método para guardar artículo 
        
    public boolean guardarArticulo(Articulo articulo){
        boolean flag= false;
        
         try{
            articulos.add(articulo);
            flag = true;
        }catch(Exception ex){
            System.out.println("ALGO MALO HA OCURRIDO");
            
        }

        return flag;
        
    }
    
//Método para solicitar libros
    
    public boolean solicitarLibro(int codigoCliente, int codigoLibro){
        boolean flag=false;
        for(Cliente cliente:clientes){
            if(cliente.getNumeroIdentidad()==codigoCliente){
                if(cliente.getCantidadPublicaciones()<5){
                    for(Libro libro: libros){
                        if(libro.getNumeroIdentificacion()==codigoLibro && libro.getEstado().equals("DISPONIBLE")){
                            LibroPadre newLibro = new LibroPadre(libro.getNumeroIdentificacion(), libro.getTitulo(), libro.getMateria(), libro.getCantidadEjemplares(),libro.getEstado());
                            cliente.setLibrosPrestados(newLibro);
                            cliente.setCantidadPublicaciones(cliente.getCantidadPublicaciones()+1);
                            flag=true;
                            libro.setCantidadEjemplares(libro.getCantidadEjemplares()-1);
                            if(libro.getCantidadEjemplares()==0){
                                libro.setEstado("AGOTADO");
                            }
                            break;
                            
                        }
                    }
                }
            }
        }
        
        return flag;
    }
    
//Método para solicitar las revistas
    
    public boolean solicitarRevista(int codigoCliente, int codigoRevista){
        boolean flag=false;
        for(Cliente cliente:clientes){
            if(cliente.getNumeroIdentidad()==codigoCliente){
                if(cliente.getCantidadPublicaciones()<5){
                    for(Revista revista: revistas){
                        if(revista.getNumeroIdentificacion()==codigoRevista && revista.getEstado().equals("DISPONIBLE")){
                            LibroPadre newRevista = new LibroPadre(revista.getNumeroIdentificacion(), revista.getTitulo(), revista.getMateria(), revista.getCantidadEjemplares(),revista.getEstado());
                            cliente.setLibrosPrestados(newRevista);
                            cliente.setCantidadPublicaciones(cliente.getCantidadPublicaciones()+1);
                            flag=true;
                            revista.setCantidadEjemplares(revista.getCantidadEjemplares()-1);
                            if(revista.getCantidadEjemplares()==0){
                                revista.setEstado("AGOTADO");
                            }
                            break;
                            
                        }
                    }
                }
            }
        }
        
        return flag;
    }
    
    
    
//Método para solicitar articulos
        
    
    public boolean solicitarArticulo(int codigoCliente, int codigoArticulo){
        boolean flag=false;
        for(Cliente cliente:clientes){
            if(cliente.getNumeroIdentidad()==codigoCliente){
                if(cliente.getCantidadPublicaciones()<5){
                    for(Articulo articulo: articulos){
                        if(articulo.getNumeroIdentificacion()==codigoArticulo  && articulo.getEstado().equals("DISPONIBLE")){
                            LibroPadre newRevista = new LibroPadre(articulo.getNumeroIdentificacion(), articulo.getTitulo(), articulo.getMateria(), articulo.getCantidadEjemplares(),articulo.getEstado());
                            cliente.setLibrosPrestados(newRevista);
                            cliente.setCantidadPublicaciones(cliente.getCantidadPublicaciones()+1);
                            articulo.setCantidadEjemplares(articulo.getCantidadEjemplares()-1);
                            if(articulo.getCantidadEjemplares()==0){
                                articulo.setEstado("AGOTADO");
                            }
                            flag=true;
                            break;
                            
                        }
                    }
                }
            }
        }
        
        return flag;
    }

// Se crearon los getters y setters   
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public ArrayList<Revista> getRevistas() {
        return revistas;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
    
    
    public int getCantidadMateria(String materia){
        
        int count = 0;
        
        for(Revista revista:revistas){
            if(revista.getMateria().equals(materia)){
                count++;
            }
        }
        for(Libro libro: libros){
            if(libro.getMateria().equals(materia)){
                count++;
            }
        }
        
        for(Articulo articulo:articulos){
            if(articulo.getMateria().equals(articulo)){
                count++;
            }
        }
        return count;
    }
    
    public int getCantidadMateriaRevista(String materia){
        
        int count = 0;
        
        for(Revista revista:revistas){
            if(revista.getMateria().equals(materia)){
                count++;
            }
        }
      
        return count;
    }
}
