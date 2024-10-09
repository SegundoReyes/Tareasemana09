
package Programa;
import java.util.Scanner;
public class Programa02 {
 public static void main (String []args){
     int numPersonas; 
        double[] ingresos; 
        double sumaIngresos = 0; 
        double ingresoMayor = Double.MIN_VALUE; 
        double ingresoPromedio;  
     Scanner lectura = new Scanner (System.in);              
        System.out.print("Ingrese el número de personas: ");
        numPersonas = lectura.nextInt();       
        ingresos = new double[numPersonas];        
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextDouble(); 
            sumaIngresos += ingresos[i]; 
           
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i]; 
            }
        }
        
        ingresoPromedio = sumaIngresos / numPersonas;        
        System.out.println("\nResultado");
        System.out.println("Ingreso promedio: " + ingresoPromedio); 
        System.out.println("Ingreso mayor: " + ingresoMayor); 

 }   
}
