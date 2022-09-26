
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
    
    /*
     * Método utilizado para crear un menú interactivo.
     * */    
    
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
        }
    }
}
      
