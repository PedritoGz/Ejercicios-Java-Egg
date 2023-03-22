package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 // Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 // muestre por pantalla en orden descendente.
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
        int numCien[] = new int[101];
        for(int i = 1; i < 101; i++){
            numCien[i]=i;
        }  
        for(int i = 100; i > 0; i--){
            System.out.println(numCien[i]);
        } 
    }
     
}

