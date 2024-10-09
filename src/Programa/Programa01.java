
package Programa;
import java.util.Scanner;
public class Programa01 {
public static void main (String []args){
     int n;
     double[] pesos;
     double sumaPesos = 0;
     double pesoPromedio;
    Scanner lectura = new Scanner (System.in);
    System.out.print("Ingrese la cantidad de personas: ");
        n = lectura.nextInt();
        pesos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = lectura.nextDouble();
            sumaPesos += pesos[i];
        }
        pesoPromedio = sumaPesos / n;
        System.out.println("Resultado: " + pesoPromedio); 
}    
}
