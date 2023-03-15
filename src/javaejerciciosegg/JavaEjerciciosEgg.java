package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.print("Ingresa un num: ");
       double num = leer.nextDouble();
       double doble = num*num; 
       double triple = num*num*num;
       System.out.println("El doble: " + doble);
       System.out.println("El triple: " + triple);
       System.out.println("La raiz: " + Math.sqrt(num));
       
        
    }
    
    
}
