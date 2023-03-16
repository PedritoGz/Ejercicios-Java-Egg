package javaejerciciosegg;

import static java.lang.Double.max;
import static java.lang.Double.min;
import java.util.Scanner;

 // @author pdrgo
 
public class JavaEjerciciosEgg {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
       System.out.print("Ingresa un primer numero: ");
       double numU1 = leer.nextDouble();
       System.out.print("Ingresa un segundo numero: ");
       double numU2 = leer.nextDouble(); 
       
       double mayor = max(numU1, numU2);
       double menor = min(numU1, numU2);
       
       int numMenu; 
       boolean salir = false;
       do{
       System.out.println("--Menu--");
       System.out.println("1) Suma");
       System.out.println("2) Resta");
       System.out.println("3) División");
       System.out.println("4) Multiplicación");
       System.out.println("5) Salir");
       System.out.println("Elige una opción: ");
       
       numMenu = leer.nextInt();
       
           switch(numMenu){
               case 1:
                  double sum = numU1 + numU2; 
                  System.out.println("Suma: " + sum); 
                  break;
               case 2:
                  double res = mayor - menor;
                  System.out.println("Resta: " + res);
                  break;
               case 3:
                  double div = mayor / menor;
                  System.out.println("División: " + div);
                  break;
               case 4:
                  double mul = numU1 * numU2; 
                  System.out.println("Multiplicación: " + mul);
                  break;
               case 5:
                  System.out.println("Estas seguro de salir (s/n)");
                  String letra = leer.next();
                  
                  if ( "s".equals(letra) ) {
                        System.out.println("Saliendo del programa...");
                        salir = true;
                    }
                  break;
               default:
                  System.out.println("Opción no válida.");                
           }
       }while(salir != true);
    }
    
    
}
