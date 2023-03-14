package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.println("Ingresa el primer num");
       int num1 = leer.nextInt();
       
       System.out.println("Ingresa el segundo num");
       int num2 = leer.nextInt();
       
       int suma = num1 + num2;
       
       System.out.println(suma);
       
        
    }
    
    
}
