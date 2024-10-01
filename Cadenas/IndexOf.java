package Cadenas;
import java.util.Scanner;
public class IndexOf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        String buscar;
        System.out.println("Ingrese una cadena");
        cadena = teclado.nextLine();
        System.out.println("Digite el valor a buscar en la cadena");
        buscar = teclado.next();
        System.out.println("La posición del elemento es: " + cadena.indexOf(buscar));




    }
    
}
