package vectores_arrays;

import java.util.Scanner;

public class VECTORES_ARRAYS {

    public static void main(String[] args) {
       //DECLARACION
       int vector [] = new int [4];
       
       //ASIGNACION (POR TECLADO)
      Scanner teclado = new Scanner (System.in);
      for (int i=0; i < vector.length; i++) {
           System.out.println("Ingrese el numero para el indice " + i);
           vector[i] = teclado.nextInt();
       }
       //ASIGNACION (MANUAL)
       //vector [0] = 2;
       //vector [1] = 35;
       //vector [2] = 48;
       //vector [3] = 157;
       
       //RECORRIDO
       for (int i=0; i < vector.length; i++) {
           System.out.println("Estoy en el indice: " + i);
           System.out.println("Hay guardado un " + vector[i]);
           System.out.println("----------------------------");
       }
    }
    
}
