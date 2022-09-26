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
    
    /*
     * Método para guardar cliente 
     * */    
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
        
    /*
    * Método para guardar libro
    * */       
        
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
        
    /*
    * Método para guardar revistas
    * */  
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
        /*
         * Método para guardar artículo 
         * */    
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
        
    
}
