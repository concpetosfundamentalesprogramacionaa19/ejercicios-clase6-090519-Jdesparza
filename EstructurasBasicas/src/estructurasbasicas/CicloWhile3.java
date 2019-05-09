/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class CicloWhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Persona 1: Jordy David Esparza Rivera - Estudiante
        
        // Declaración de variables
        // String mensajeFinal = "Listado de personas\n\n";
        // String nombre = "Jordy David";
        // String apellido = "Esparza Rivera";
        // String profesion = "Estudiante";
        
        Scanner entrada = new Scanner(System.in);
        String mensajeFinal = "";
        String nombre = "";
        String apellido = "";
        String profesion = "";
        int contador = 1;
        boolean bandera = true;
        String opcion;
        
        mensajeFinal = String.format("%s%s\n\n%s\n\n", mensajeFinal, 
                "Informe de la ciudad de Loja", "Listado de personas");
        
        /*
         * Ciclo repetitivo While, solo se ejecuta cuando la condición aun
         * permanece verdadera y finaliza cuando la condición se hace falsa
        */
        while (bandera == true) { 
            // Ingreso de datos por teclado
            System.out.println("Por favor ingrese sus nombres: ");
            nombre = entrada.nextLine();
            System.out.println("Por favor ingrese sus apellidos: ");
            apellido = entrada.nextLine();
            System.out.println("Por favor ingrese su profesión: ");
            profesion = entrada.nextLine();
            
            mensajeFinal = String.format("%sPersona %d: %s %s - %s\n", 
                    mensajeFinal, contador, nombre, apellido, profesion); 
            
            // que el contador se incrementa en 1 
            contador = contador + 1;
            // Ingreso de datos por teclado
            System.out.println("Digite 'n' para salir");
            opcion = entrada.nextLine();
            
            // Ciclo repetitivo if que solo funciona cuando se cumple su 
            // condición
            if (opcion.equals("n")){
                bandera = false;
            }
            
        }
        System.out.printf("%s", mensajeFinal);
    }
    
}
