package Cadenas;
import java.util.Scanner;
public class NUmeroNarcisista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
         
        System.out.println("Ingrese el número");
        cadena = teclado.nextLine();
        String arreglo[] = cadena.split("");
        int cifras = 0;
        int numero = Integer.parseInt(cadena);
        int suma = 0;
        int resultado = 0;
        for(String dato: arreglo){
            //System.out.println("dato: " + dato);
            
            numero = cadena.length();
            cifras = Integer.parseInt(dato);
            suma = (int) Math.pow(cifras, numero);
            resultado += Math.pow(cifras, numero);
            System.out.println("EL resutaldo es: " + suma);
          //  System.err.println("------------------");
           // System.err.println("segundo dato de prueba " + resultado );
        }
        
        System.out.println("El resutlado es " + resultado);

       


    }
    
}
