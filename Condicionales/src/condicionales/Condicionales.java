
package condicionales;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
       //int num1 = 5;
       //int num2 = 2;
       
       //if (num2 > num1) {
       //    System.out.println("el num2 es mayor al num1");
       //} else {
       //    System.out.println("el num2 es menor al num1");
       //}
       
       //CONDICIONALES ANIDADOS
       
       //int num1 = 17;
       //int num2 = 17;
       
       //if (num2 > num1) {
       //    System.out.println("El num2 es mayor al num1");
       //} else {
       //    if (num1 == num2) {
       //        System.out.println("Son iguales");
       //    } else {
       //        System.out.println("El num1 es mayor al num2");
       //    }
       //}
       
       //SWITCH
       
       /*int dia = 10;
       String nombreDia;
       
       switch (dia) {
           case 1:
               nombreDia="Lunes";
           break;
           
           case 2:
               nombreDia="Martes";
           break;
           
           case 3:
               nombreDia="Miercoles";
           break;
           
           case 4:
               nombreDia="Jueves";
           break;
           
           case 5:
               nombreDia="Viernes";
           break;
           
           case 6:
               nombreDia="Sabado";
           break;
           
           case 7:
               nombreDia="Domingo";
           break;
           
           default:
               nombreDia="Numero invalido";
           break;
       }
       
        System.out.println("El dia de la semana seleccionado es: " + nombreDia);
        */
       
        //EJERCICIO INTEGRADOR
        double sueldo = 0;
        int categoria;
        
        System.out.println("Ingrese la categoria para calcular sueldo");
        Scanner teclado = new Scanner (System.in);
        categoria = teclado.nextInt();
        
        if (categoria == 1) {
            sueldo = 15890 + (15890*0.10);
        } else if (categoria == 2) {
            sueldo = 25630.89;
        } else if (categoria == 3) {
            sueldo = 35560.20 - (35560.20*0.11);
        } else {
            System.out.println("Ingrese un numero de categoria valido");
        }
        
        if (categoria  == 1 || categoria == 2 || categoria == 3) {
            System.out.println("El total del sueldo para categoria: " + categoria + " es de: " + sueldo);
        }
    }
    
}
