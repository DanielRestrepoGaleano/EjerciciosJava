package Cadenas;

import java.util.Scanner;

public class Comparación {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String cadena1;
        String cadena2;
        System.out.println("Ingrese la primera cadena");
        cadena1 = teclado.next();
        System.out.println("Ingrese la segunda cadena");
        cadena2 = teclado.next();
        if(cadena1.compareTo(cadena2) < 0){
            System.out.println("La palabra " + cadena1 + " va primero que " + cadena2);
        }else if(cadena1.compareTo(cadena2)> 0){
            System.out.println("La palabra " + cadena2 + " va primero que " + cadena1);
        }else{
            System.out.println("Ambas palabras son iguales");
        }

        /* 
        if (cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
*/
    }

}
