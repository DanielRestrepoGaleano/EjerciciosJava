package Expresiones_regualres;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Excepciones {
    
    public static void main(String[] args) {
        /* 
        //Arreglos
        int numeros[] = {5, 2, 3, 7};
        System.out.println(numeros[5]);
        */

        /* 
        division por 0
        int a = 25;
        int b = 0;
        int resultado = a / b;
        System.out.println(resultado);
        */
        try{
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite un número");
        int numero = teclado.nextInt();
    } catch(InputMismatchException err){
        System.out.println("Error: no es un número");
    }
    }

}
