package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.println("Ingresa una frase: ");
       String frase = leer.nextLine();
       String letra = frase.substring(0,1);
       if( "A".equals(letra)){
        System.out.println("Correcto");   
       }else{
           System.out.println("Incorrecto");
       } 
    }
    
    
}
