package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.print("Ingresa un numero limite: ");
       int numU = leer.nextInt();
       int sum = 0;
       System.out.println("Ingresa numeros para sumar: ");       
       while(sum <= numU ){
         
         int num = leer.nextInt();
         sum = sum + num;
       }
        System.out.println("Suma: " + sum);
    }
    
    
}
