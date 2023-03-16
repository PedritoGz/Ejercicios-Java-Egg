package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingresa un num: ");
        int numU = leer.nextInt();
       for (int i = 0; i < numU; i++) {
            for (int j = 0; j < numU; j++) {
                if (i == 0 || i == numU - 1 || j == 0 || j == numU - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}

