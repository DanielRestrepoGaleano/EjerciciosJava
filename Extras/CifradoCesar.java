package Extras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//CODIGO TOMADO DE
/*
 * De Roer, D. D., & De Roer, D. D. (2022, 12 junio).
 *  Cifrado Cesar en Java. Disco Duro de Roer -.
 *  https://www.discoduroderoer.es/cifrado-cesar-en-java/
 */
//NOTA: EL CODIGO HA SIDO MODIFICADO.
public class CifradoCesar {
    public static void main(String[] args) {
        boolean continuar = true;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Para cifrar, codificar y decodificar");
            System.out.println("2. Para salir");
            System.out.println("Ingrese una opción");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                mostrar();
                break;
                case 2:
                continuar = false;
                break;
        }
    
        
    }while(continuar);

    }
/**
 * The `mostrar` function takes user input for a phrase, encodes it using randomly generated letters,
 * and then decodes the encoded text.
 */
public static void mostrar(){
    Scanner sn = new Scanner(System.in);
    boolean continuar = true;
    
        sn.useDelimiter("\n");
        String letras = generarLetrasAleatorias();

        System.out.println("Dame una frase:");
        String frase = sn.next();

        String texto = codificar(letras, frase);
        System.out.println("Texto codificado: " + texto);

        texto = descodificar(letras, texto);
        System.out.println("Texto descodificado: " + texto);

}



/**
 * The function generates a random string of letters, numbers, and special characters by shuffling a
 * predefined base string.
 * 
 * @return A random string of letters, numbers, and special characters shuffled in a random order.
 */
    public static String generarLetrasAleatorias() {
        //Este diccionario puede ser editado.
        String base = "ABCDEFGHIJKLMNÑOPQR_STUVWXYZ!$#/()=;1234567890";
        List<Character> caracteres = new ArrayList<>();
        for (char c : base.toCharArray()) {
            caracteres.add(c);
        }
        Collections.shuffle(caracteres); // Mezcla los caracteres
        StringBuilder letrasAleatorias = new StringBuilder();
        for (char c : caracteres) {
            letrasAleatorias.append(c);
        }
        return letrasAleatorias.toString();
    }

/**
 * The function `codificar` encodes a given text using a specified set of characters by shifting each
 * character by 3 positions within the set.
 * 
 * @param letras The `letras` parameter in the `codificar` method  represent a string
 * containing the characters that can be encoded. This method encode a given text by
 * shifting each character by 3 positions in the `letras` string. If a character is not found in the
 * `le
 * @param texto The `texto` parameter in the `codificar` method is the text that you want to encode
 * using a simple Caesar cipher algorithm. The method takes each character in the `texto` string,
 * shifts it by 3 positions in the `letras` string, and returns the encoded text.
 * @return The method `codificar` returns a String that represents the encoded version of the input
 * text using a simple Caesar cipher with a shift of 3 positions in the provided alphabet.
 */
    public static String codificar(String letras, String texto) {
        String textoCodificado = "";
        texto = texto.toUpperCase();
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            int pos = letras.indexOf(caracter);
            if (pos == -1) {
                textoCodificado += caracter;
            } else {
                textoCodificado += letras.charAt((pos + 3) % letras.length());
            }
        }
        return textoCodificado;
    }

/**
 * The function `descodificar` decodes a given text using a specific set of characters by shifting each
 * character three positions to the left in the character set.
 * 
 * @param letras The `letras` parameter in the `descodificar` method represents a string containing the
 * characters used for encoding or decoding a text. These characters are typically in a specific order
 * or sequence that is used as a reference for shifting positions during encoding or decoding
 * processes.
 * @param texto The `texto` parameter in the `descodificar` method is the text that you want to decode
 * using a specific set of characters provided in the `letras` parameter. The method decodes the text
 * by shifting each character in the `texto` parameter three positions to the left in the `
 * @return The method `descodificar` returns a `String` which is the decoded version of the input
 * `texto` based on the provided `letras` string.
 */
    public static String descodificar(String letras, String texto) {
        String textoDescodificado = "";
        texto = texto.toUpperCase();
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            int pos = letras.indexOf(caracter);
            if (pos == -1) {
                textoDescodificado += caracter;
            } else {
                if (pos - 3 < 0) {
                    textoDescodificado += letras.charAt(letras.length() + (pos - 3));
                } else {
                    textoDescodificado += letras.charAt((pos - 3) % letras.length());
                }
            }
        }
        return textoDescodificado;
    }
}
