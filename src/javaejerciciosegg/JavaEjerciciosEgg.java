package javaejerciciosegg;

import java.util.Scanner;


 // @author pdrgo
 // Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 // de 2 dígitos, etcétera (hasta 5 dígitos).
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
        int num[] = {1,10,55,1012,11001,2,1240,6,111,54789};
        int contador [] = new int[10];
        int contadorUno = 0;
        int contadorDos = 0;
        int contadorTres = 0;
        int contadorCuatro = 0;
        int contadorCinco = 0;
        for(int i = 0; i < num.length; i++){
            String numerosCadena = Integer.toString(num[i]);
            if (numerosCadena.length()<=5){
                contador[i] = (numerosCadena.length());
            }
            System.out.println("El numero: " + num[i] + " tiene " + contador[i] + " cifras");
          
            
            if (contador[i]==1){
                contadorUno++;
            } 
            if (contador[i]==2){
                contadorDos++;
            } 
            if (contador[i]==3){
                contadorTres++;
            } 
            if (contador[i]==4){
                contadorCuatro++;
            } 
            if (contador[i]==5){
                contadorCinco++;
            } 
        }
        System.out.println("Numeros con 1 cifra: " + contadorUno);
        System.out.println("Numeros con 2 cifras: " + contadorDos);
        System.out.println("Numeros con 3 cifras: " + contadorTres);
        System.out.println("Numeros con 4 cifras: " + contadorCuatro);
        System.out.println("Numeros con 5 cifras: " + contadorCinco);
        
        
    }
     
}
