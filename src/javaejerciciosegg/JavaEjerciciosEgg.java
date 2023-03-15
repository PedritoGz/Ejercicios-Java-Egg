package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.println("Ingresa una frase");
       String frase = leer.nextLine();
       
       System.out.println(frase.toLowerCase());
       System.out.println(frase.toUpperCase());
       
        
    }
    
    
}
