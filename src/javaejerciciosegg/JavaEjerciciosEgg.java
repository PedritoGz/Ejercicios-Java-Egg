package javaejerciciosegg;

import java.util.Scanner;
import java.lang.Math;


 // @author pdrgo

 // Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 // traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
 // obtiene cambiando sus filas por columnas (o viceversa).
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       int num [][] = new int [4][4];
       
       for(int i = 0; i < 4; i++){
           for(int j = 0; j < 4; j++){
               num[i][j] = (int) (Math.random() * 10);
           }
       }
       System.out.println("Matriz A: ");
       for(int i = 0; i < 4; i++){
           for(int j = 0; j < 4; j++){
               System.out.print(num[i][j] + "    ");
           }
           System.out.println("");
       }
       System.out.println("Mateiz A transpuesta: ");
       for(int j = 0; j < 4; j++){
           for(int i = 0; i < 4; i++){
               System.out.print(num[i][j] + "    ");
           }
           System.out.println("");   
        }
     
    }

}