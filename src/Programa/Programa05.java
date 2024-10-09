
package Programa;
import java.util.Scanner;
public class Programa05 {
 public static void main (String []args){
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[a.length + b.length];     
     Scanner lectura = new Scanner (System.in);             
        System.out.println("Ingrese los valores para el arreglo a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = lectura.nextInt();
        }
        System.out.println("\nIngrese los valores para el arreglo b:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = lectura.nextInt();
        }       
        int indexC = 0;
        for (int i = 0; i < a.length; i++) {
            c[indexC++] = a[i]; 
            c[indexC++] = b[i];
        }
        System.out.println("\nArreglo c (valores intercalados): ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }               
 }   
}
