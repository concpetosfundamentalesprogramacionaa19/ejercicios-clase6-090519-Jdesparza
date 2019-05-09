/*
 * Desarrollar una aplicación que me permita ingresar placas de carros
 * Se asume que las placas ingresadas pertenece a la región costa de Ecuador
 * en base a la placa nuestro programa deteriminara y presentara con la 
 * provincia a la que pertenece.
 */
package manejosswitch;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaración de variables
        String placa;

        String nombre = "";
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por Favor ingrese la placa del carro: ");
        placa = entrada.nextLine();
       
        char valor = placa.charAt(0);      
        switch(valor){
            case'e':
            case'E':
                System.out.printf("Placa con inicial %s de Esmeraldas \n", 
                        valor, placa.toUpperCase());
                break;
            
            case'j':
            case'J':
                System.out.printf("Placa con inicial %s de Santo Domingo "
                        + "de los Tsachilas \n", 
                        valor, placa.toUpperCase());
                break;    
            
            case'm':
            case'M':
                System.out.printf("Placa con inicial %s de Manabí \n", 
                        valor, placa.toUpperCase());
                break;
            
            case'r':
            case'R':
                System.out.printf("Placa con inicial %s de Los Ríos \n", 
                        valor, placa.toUpperCase());
                break;  
            
            case 'g':
            case 'G':
                System.out.printf("Placa con inicial %s de Guayas \n", 
                        valor, placa.toUpperCase());
                break; 
              
            case 'y':
            case 'Y':
                System.out.printf("Placa con inicial %s de Santa Elena \n", 
                        valor, placa.toUpperCase());
                break; 
            
            case 'o':
            case 'O':
                System.out.printf("Placa con inicial %s de El Oro \n", 
                        valor, placa.toUpperCase());
                break; 
                
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
