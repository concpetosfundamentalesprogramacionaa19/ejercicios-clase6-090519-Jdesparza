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
public class EstructurasBasicas {

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
        
        mensajeFinal = String.format("\n%s%s\n\n%s\n\n", mensajeFinal, 
                "Informe de la ciudad de Loja", "Listado de personas");
        
        /*
         * Ciclo repetitivo While, solo se ejecuta cuando la condición aun
         * permanece verdadera y finaliza cuando la condición se hace falsa
        */
        while (contador < 5) { 
            // Ingreso de datos por teclado
            System.out.print("Por favor ingrese sus nombres: ");
            nombre = entrada.nextLine();
            System.out.print("Por favor ingrese sus apellidos: ");
            apellido = entrada.nextLine();
            System.out.print("Por favor ingrese su profesión: ");
            profesion = entrada.nextLine();
            
            // System.out.printf("persona %d: %s %s - %s\n", contador, nombre, 
            //      apellido, profesion);
                    
            mensajeFinal = String.format("%sPersona %d: %s %s - %s\n", 
                    mensajeFinal, contador, nombre, apellido, profesion); 
            
            // que el contador se incrementa en 1 hasta llegar a 5
            contador = contador + 1;
        }
        // Se imprime el mensaje
        System.out.printf("%s", mensajeFinal);
    }
    
}
