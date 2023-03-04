package ejercicio.integrador.pkg2;

import java.util.Scanner;

public class EjercicioIntegrador2 {

    public static void main(String[] args) {
       int vector [] = new int [15];
       int contadorNumTres = 0;
       
       Scanner teclado = new Scanner (System.in);
       for (int v = 0; v < 15; v++) {
           System.out.println("Ingrese un numero");
           vector[v] = teclado.nextInt();
       }
       
       for (int v = 0; v < 15; v++) {
           if (vector[v] == 3) {
               contadorNumTres+=1;
           }
       }
       System.out.println("Se cargo el numero 3: " + contadorNumTres + "veces");
       
    }
    
}
