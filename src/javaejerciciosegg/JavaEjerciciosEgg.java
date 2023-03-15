package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.println("Ingresa los grados c°: ");
       double c = leer.nextDouble();
       double f = (32 + c*(9/5));
       System.out.println("Los grados f°: " + f);
       
        
    }
    
    
}
