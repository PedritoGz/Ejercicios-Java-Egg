package javaejerciciosegg;

import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de Euros");
        double euros = leer.nextDouble();
        System.out.println("Convertir a:");
        System.out.println("1) Dolares");
        System.out.println("2) Libras");
        System.out.println("3) Yenes");
        System.out.print("Elige una Opción: ");
        int opc = leer.nextInt();
        cambio(euros, opc);  
    }
    
     public static void cambio(double euros, int opc) {
         
       switch(opc){
           case 1:
               double dolar = 1.28611 * euros;
               System.out.println(dolar);
               break;
           case 2:
               double libra = 0.86 * euros;
               System.out.println(libra);
               break;
           case 3:
               double yenes = 129.852 * euros;
               System.out.println(yenes);
               break;
       } 
    }  
}

