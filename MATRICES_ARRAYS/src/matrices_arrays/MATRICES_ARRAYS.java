
package matrices_arrays;

import java.util.Scanner;

public class MATRICES_ARRAYS {

    public static void main(String[] args) {
        //DECLARACION
        int matriz [][] = new int [3][3];
    
        //ASIGNACION (MANUAL)
        //matriz[0][0] = 5;
        //matriz[0][1] = 10;
        //matriz[0][2] = 15;
        //matriz[1][0] = 20;
        //matriz[1][1] = 25;
        //matriz[1][2] = 30;
        //matriz[2][0] = 45;
        //matriz[2][1] = 50;
        //matriz[2][2] = 55;
        
        //ASIGNACION POR TECLADO
        
        Scanner teclado = new Scanner (System.in);
        
        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++) {
                System.out.println("Ingrese el valor de f: " + f + "c: " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }
    
        //RECORRIDO
        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++) {
                System.out.println("El valor de f: " + f + "c: " + c);
                System.out.println("es de: " + matriz[f][c]);
            }
        }
    }
}