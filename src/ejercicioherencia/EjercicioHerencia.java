
package ejercicioherencia;

import controlador.EjercicioControlador;
import java.util.Scanner;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Libro;
import modelo.LibroPadre;
import modelo.Revista;


public class EjercicioHerencia {

    /**
     * @param args the command  arguments
     */
    static Scanner entrada= new Scanner(System.in);
    static EjercicioControlador controlador = new EjercicioControlador();
    public static void main(String[] args) {
        // TODO code application logic her
        menu();
    }
    
    // Método utilizado para crear un menú interactivo.
         
    public static  void menu(){
        int respuesta=0;
        while(respuesta!=12){
            System.out.println("BIENVENIDOO A LA BIBLOTECA UVG");
            System.out.println("ELIGE UNA OPCIÓN");
            System.out.println("1. agregar libro");
            System.out.println("2. agregar revista");
            System.out.println("3. agregar articulo");
            System.out.println("4. agregar cliente");
            System.out.println("5. ver documentos");
            System.out.println("6. ver clientes");
            System.out.println("7. ver cantidad de documentos según materia");
            System.out.println("8. ver cantidad de revista según materia");
            System.out.println("9. solicitar libro");
            System.out.println("10. solicitar revista");
            System.out.println("11. solicitar articulo");
            System.out.println("12. SALIR");
            respuesta= entrada.nextInt();
            
            
            switch(respuesta){
                case 1:
                    System.out.print("INGRESA EL  NUMERO DE IDENTIFICACIÓN ");
                    int numeroIdentificacionlibro= entrada.nextInt();
                    System.out.print("INGRESA EL TITULO ");
                    String titulolibro = entrada.next();
                    System.out.print("INGRESA LA MATERIA ");
                    String materialibro = entrada.next();
                    System.out.print("INGRESA LA CANTIDAD DE EJEMPLARES ");
                    int cantidadEjemplareslibro=entrada.nextInt();
                    System.out.print("INGRESA EL ESTADO (DISPONIBLE O AGOTADO) ");
                    String estadolibro = entrada.next();
                    System.out.print("INGRESA EL AUTOR ");
                    String autorlibro = entrada.next();
                    System.out.print("INGRESA EL EDITORIAL ");
                    String editoriallibro = entrada.next();
                    
                    Libro newibro = new Libro(numeroIdentificacionlibro, titulolibro, materialibro,cantidadEjemplareslibro, estadolibro,autorlibro,editoriallibro);
                    if(controlador.guardarLibro(newibro)){
                        System.out.print("LIBRO GUARDADO");
                    }else{
                        System.out.print("ALGO MALO HA OCURRIDO INTENTE DE NUEVO");
                    }
                    break;
                case 2:
                    System.out.print("INGRESA EL  NUMERO DE IDENTIFICACIÓN ");
                    int numeroIdentificacionRevista= entrada.nextInt();
                    System.out.print("INGRESA EL TITULO ");
                    String tituloRevista = entrada.next();
                    System.out.print("INGRESA LA MATERIA ");
                    String materiaRevista = entrada.next();
                    System.out.print("INGRESA LA CANTIDAD DE EJEMPLARES ");
                    int cantidadEjemplaresRevista=entrada.nextInt();
                    System.out.print("INGRESA EL ESTADO (DISPONIBLE O AGOTADO) ");
                    String estadoRevista = entrada.next();
                    System.out.print("INGRESA EL AÑO ");
                    int anioRevista = entrada.nextInt();
                    System.out.print("INGRESA EL NUMERO DE REVISTA ");
                    int noRevistaRevista = entrada.nextInt();
                    
                    Revista newRevista = new Revista(numeroIdentificacionRevista,tituloRevista,materiaRevista,cantidadEjemplaresRevista,estadoRevista,anioRevista,noRevistaRevista);
                    
                    if(controlador.guardarRevista(newRevista)){
                        System.out.print("REVISTA GUARDADA");
                    }else{
                        System.out.print("ALGO MALO HA OCURRIDO INTENTE DE NUEVO");
                    }
                    break;
                case 3:
                    
                    System.out.print("INGRESA EL  NUMERO DE IDENTIFICACIÓN ");
                    int numeroIdentificacionArticulo= entrada.nextInt();
                    System.out.print("INGRESA EL TITULO ");
                    String tituloArticulo = entrada.next();
                    System.out.print("INGRESA LA MATERIA ");
                    String materiaArticulo = entrada.next();
                    System.out.print("INGRESA LA CANTIDAD DE EJEMPLARES ");
                    int cantidadEjemplaresArticulo=entrada.nextInt();
                    System.out.print("INGRESA EL ESTADO (DISPONIBLE O AGOTADO) ");
                    String estadoArticulo = entrada.next();
                    System.out.print("INGRESA EL ARBITRO ");
                    String arbitroArticulo = entrada.next();
                    
                    Articulo newArticulo = new Articulo(numeroIdentificacionArticulo,tituloArticulo,materiaArticulo,cantidadEjemplaresArticulo,estadoArticulo,arbitroArticulo);
                    
                    if(controlador.guardarArticulo(newArticulo)){
                        System.out.print("ARTICULO GUARDADO");
                    }else{
                        System.out.print("ALGO MALO HA OCURRIDO INTENTE DE NUEVO");
                    }
                    break;
                case 4:
                    
                    System.out.print("INGRESA EL  NUMERO DE IDENTIDAD ");
                    int numeroIdentidad= entrada.nextInt();
                    System.out.print("INGRESA EL NOMBRE ");
                    String nombre = entrada.next();
                    System.out.print("INGRESA LA DIRECCION ");
                    String direccion = entrada.next();
                    
                    Cliente newCliente = new Cliente(numeroIdentidad, nombre,direccion,0);
                    
                    
                    if(controlador.guardarCliente(newCliente)){
                        System.out.println("CLIENTE GUARDADO");
                    }else{
                        System.out.println("ALGO MALO HA OCURRIDO, INTENTE DE NUEVO");
                    }
                    
                    break;
                    
                case 5:
                    
                    System.out.println("========================");
                    System.out.println("LIBROS");
                    System.out.println("========================");
                    for(Libro libro: controlador.getLibros()){
                        System.out.println("IDENTIFICACIÓN: "+ libro.getNumeroIdentificacion());
                        System.out.println("TITULO: "+ libro.getTitulo());
                        System.out.println("AUTOR: "+ libro.getAutor());
                        System.out.println("ESTADO: "+ libro.getEstado());
                        System.out.println("==================================================");

                    }
                    
                    System.out.println("========================");
                    System.out.println("REVSTAS");
                    System.out.println("========================");
                    
                    for(Revista revista: controlador.getRevistas()){
                        System.out.println("IDENTIFICACIÓN: "+ revista.getNumeroIdentificacion());
                        System.out.println("TITULO: "+ revista.getTitulo());
                        System.out.println("ESTADO: "+ revista.getEstado());
                        System.out.println("AÑO: "+ revista.getAnio());
                        System.out.println("==================================================");

                    }
                    
                    
                    System.out.println("========================");
                    System.out.println("ARTICULOS");
                    System.out.println("========================");
                    for(Articulo articulo: controlador.getArticulos()){
                        System.out.println("IDENTIFICACIÓN: "+ articulo.getNumeroIdentificacion());
                        System.out.println("TITULO: "+ articulo.getTitulo());
                        System.out.println("ESTADO: "+ articulo.getEstado());
                        System.out.println("ARBITRO: "+ articulo.getArbitro());
                        System.out.println("==================================================");
                    }
                    break;
                    
                case 6:
                    System.out.println("========================");
                    System.out.println("CLIENTES");
                    System.out.println("========================");
                    for(Cliente cliente: controlador.getClientes()){
                        System.out.println("IDENTIFICACIÓN: "+ cliente.getNumeroIdentidad());
                        System.out.println("NOMBRE: "+ cliente.getNombre());
                        System.out.println("DIRECCION: "+ cliente.getDireccion());
                        System.out.println("CANTIDAD PUBLICACIONES: "+ cliente.getCantidadPublicaciones());
                        
                        
                        if(cliente.getLibrosPrestados() != null){
                            for(LibroPadre libro:cliente.getLibrosPrestados()){
                                System.out.println("NOMBRE DE DOCUMENTO PRESTADO: "+libro.getTitulo());
                            }
                        }
                       
                        System.out.println("==================================================");
                    }
                    break;
                case 7:
                    System.out.print("INGRESE LA MATERIA");
                    String materia = entrada.next();
                    
                    int numeroTotal = controlador.getCantidadMateria(materia);
                    
                    System.out.println("EXISTEN: "+numeroTotal);
                    
                    break;
                case 8:
                    System.out.print("INGRESE LA MATERIA");
                    String materiaR = entrada.next();
                    
                    int numeroTotalRevista = controlador.getCantidadMateriaRevista(materiaR);
                    
                    System.out.println("EXISTEN: "+numeroTotalRevista);
                    break;
                    
                case 9:
                    System.out.print("ingrese el codigo del cliente: ");
                    int codigoClienteLibro = entrada.nextInt();
                    System.out.print("ingrese el codigo del libro");
                    int codigoLibroLibro = entrada.nextInt();
                    if(controlador.solicitarLibro(codigoClienteLibro, codigoLibroLibro)){
                        System.out.println("SE HA SOLICITADO EXITOSAMENTE");
                    }else{
                        System.out.println("PARECE QUE ESTE LIBRO NO ESTA DISPONIBLE");
                    }
                    break;
                case 10:
                    System.out.print("ingrese el codigo del cliente: ");
                    int codigoClienteRevista = entrada.nextInt();
                    System.out.print("ingrese el codigo del revista");
                    int codigoLibroRevista = entrada.nextInt();
                    if(controlador.solicitarRevista(codigoClienteRevista, codigoLibroRevista)){
                        System.out.println("SE HA SOLICITADO EXITOSAMENTE");
                    }else{
                        System.out.println("PARECE QUE ESTA REVISTA NO ESTA DISPONIBLE");
                    }
                    break;
                case 11:
                    System.out.print("ingrese el codigo del cliente: ");
                    int codigoClienteArticulo= entrada.nextInt();
                    System.out.print("ingrese el codigo del articulo");
                    int codigoLibroArticulo = entrada.nextInt();
                    if(controlador.solicitarRevista(codigoClienteArticulo, codigoLibroArticulo)){
                        System.out.println("SE HA SOLICITADO EXITOSAMENTE");
                    }else{
                        System.out.println("PARECE QUE ESTE ARTICULO NO ESTA DISPONIBLE");
                    }
                    break;
                case 12:
                    System.out.println("gracias por usar el programa");
                    break;
                         
                
            }
        
        }
       
    }
    
}