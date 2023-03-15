package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.print("Ingresa el nombre del jugador de la historia: ");
       String frase = leer.nextLine();
       
       if( frase.equals("Messi")){
        System.out.println("Correcto Pibe, Somos campeones del Mundo");   
       }else{
           System.out.println("Incorrecto, no sabes nada de fut");
       } 
    }
    
    
}
