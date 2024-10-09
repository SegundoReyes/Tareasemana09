
package Programa;
import java.util.Scanner;
public class Programa04 {
 public static void main (String []args){   
        String[] nombres = new String[5]; 
        String nombre; 
        String nombreBuscado; 
        boolean encontrado = false;
        int posicion = -1;         
     Scanner lectura = new Scanner (System.in);       
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombre = lectura.nextLine(); 
            nombres[i] = nombre; 
        }       
        System.out.print("\nIngrese el nombre a buscar: ");
        nombreBuscado = lectura.nextLine();     
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i + 1; 
                break;
            }
        }       
        if (encontrado) {
            System.out.println("\nLa persona " + nombreBuscado + " existe en la posición " + posicion + ".");
        } else {
            System.out.println("\nLa persona " + nombreBuscado + " no existe en el arreglo de datos.");
        }        
    }   
    }
