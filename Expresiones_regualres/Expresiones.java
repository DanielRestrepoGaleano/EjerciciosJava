package Expresiones_regualres;

import java.util.Scanner;

public class Expresiones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String edadAux;
        int edad;
        String estaturaAux;
        float estatura;

        do {
            System.out.println("Digite un nombre");
            nombre = teclado.nextLine();
            // Si el nombre contiene un caracter no válido ingresa por el if y muestra el
            // mensaje de error
            if (!validarNombre(nombre)) {
                System.out.println("El nombre ingresado es incorrecto");
            }

        } while (validarNombre(nombre) == false);

        do {
            System.out.println("Digite una edad");
            edadAux = teclado.next();
            if (!validarEdad(edadAux)) {
                System.out.println("Edad ingresada es incorrecta");
            }
        } while (validarEdad(edadAux) == false);

        // Convertir el String edadAux a un intero
        edad = Integer.parseInt(edadAux);

        do {
            System.out.println("Digite su estatura");
            estaturaAux = teclado.next();
            if (!validarEstatura(estaturaAux)) {
                System.out.println("Estatura ingresada es incorrecta");
            }
        } while (validarEstatura(estaturaAux) == false);
        
    }

    public static boolean validarNombre(String nom) {

        // "-" para un rango
        // No puede haber espacios en la expresion regular
        return nom.matches("[a-zA-Z\s]{7,40}+");

    }

    public static boolean validarEdad(String ed) {
        return ed.matches("[0-9]{1,2}+");

    }

    // Validación para valores flotantes "\\d."
    public static boolean validarEstatura(String est) {
        return est.matches("[\\d.]{3,4}+");
    }

}
/**
 * \s: Este es un carácter especial en expresiones regulares que coincide con
 * cualquier
 * carácter de espacio
 * en blanco, como espacios, tabulaciones, saltos de línea, etc.
 * En este caso, se permite que el nombre contenga espacios entre las palabras.
 * +: Este es un cuantificador que indica que el patrón anterior
 * (en este caso, [a-zA-Z\s]) debe aparecer una o más veces en la cadena.
 * Es decir, el nombre puede contener una o más letras (mayúsculas o minúsculas)
 * y espacios.
 */
// Existen validadores de expresiones regulares en internet
