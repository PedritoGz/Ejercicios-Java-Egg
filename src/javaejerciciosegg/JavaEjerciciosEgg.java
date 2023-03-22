package javaejerciciosegg;

import java.util.Scanner;


 // @author pdrgo
 // Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
 // al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 // numero y si se encuentra repetido
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
        int num[] = new int[10];
       
        for(int i = 0; i < 10; i++){
            num[i]= (int)(Math.random()*10+1);
        } 
        System.out.print("Ingresa un num (1-10) para buscar:");
        int numU = leer.nextInt();
        int contador = 0;
        int i;
        for( i = 0; i < 10; i++){
            if (numU == num[i]){
                System.out.println("Esta en la posición: " + (i+1)); 
                contador++;
            }
        }
        if (contador == 0 ){   
                System.out.println("No se encontro similitud");
            }
        for(i = 0; i < 10; i++){
            System.out.print(num[i] + " ");
        }  
        System.out.println(" ");
    }
     
}
