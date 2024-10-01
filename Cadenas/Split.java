package Cadenas;
import java.util.Scanner;
public class Split {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
         
        System.out.println("Ingrese el conjunto de datos");
        cadena = teclado.nextLine();
        String arreglo[] = cadena.split("-");

        for(String dato: arreglo){
            System.out.println("dato: " + dato);
        }


    }
    
}
