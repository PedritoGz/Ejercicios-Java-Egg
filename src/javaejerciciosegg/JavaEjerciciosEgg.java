package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.print("Ingresa un num: ");
       int num = leer.nextInt();
       
       if( num % 2 == 0 ){
        System.out.println("Es par");   
       }else{
           System.out.println("Es inpar");
       } 
    }
    
    
}
