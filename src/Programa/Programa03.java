
package Programa;
import java.util.Scanner;
public class Programa03 {
 public static void main (String[]args){
    int numPersonas; 
        double[] compras; 
        double sumaCompras = 0; 
        double compraMayor = Double.MIN_VALUE; 
        double compraMenor = Double.MAX_VALUE; 
        double compraPromedio;  
     Scanner lectura = new Scanner (System.in);
     System.out.print("Ingrese el número de personas: ");
        numPersonas = lectura.nextInt();       
        compras = new double[numPersonas];        
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese la compra de la persona " + (i + 1) + ": ");
            compras[i] = lectura.nextDouble(); 
            sumaCompras += compras[i];            
            if (compras[i] > compraMayor) {
                compraMayor = compras[i]; 
            }            
            if (compras[i] < compraMenor) {
                compraMenor = compras[i]; 
            }
        }        
        compraPromedio = sumaCompras / numPersonas;        
        System.out.println("\nResultado");
        System.out.println("Total de compras: " + (sumaCompras % 1 == 0 ? String.format("%.0f", sumaCompras) : sumaCompras)); 
        System.out.println("Promedio de compras: " + (compraPromedio % 1 == 0 ? String.format("%.0f", compraPromedio) : compraPromedio)); 
        System.out.println("Compra mayor: " + (compraMayor % 1 == 0 ? String.format("%.0f", compraMayor) : compraMayor)); 
        System.out.println("Compra menor: " + (compraMenor % 1 == 0 ? String.format("%.0f", compraMenor) : compraMenor));
 }   
}
