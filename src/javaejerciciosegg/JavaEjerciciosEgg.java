package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       int contadorCorrectas = 0;
       int contadorIncorrectas = 0;
       String frase;
       
       do{
          
          System.out.print("Ingresa una frase: ");
          frase = leer.nextLine(); 
 
          if(frase.length()==5 && "O".equals(frase.substring(4, 5)) && "X".equals(frase.substring(0, 1)) ){
              contadorCorrectas++;
          } else {
              contadorIncorrectas++;
          }
       }while(!("&&&&&".equals(frase)));
       
        System.out.println("Secuencias correctas: " + contadorCorrectas);
        System.out.println("Secuencias incorrectas: " + contadorIncorrectas);
    }
    
    
}
