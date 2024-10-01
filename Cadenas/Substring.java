package Cadenas;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena, total = "";
        int posInicial;
        int posFinal;
        System.out.print("Ingrese una cadena");
        cadena = teclado.next();
        /* 
        System.out.print("Posicion ininicial a capturar");
        posInicial = teclado.nextInt();
        System.out.print("Posicion final a capturar");
        posFinal = teclado.nextInt();


        System.out.println("La cadena es " +  cadena.substring(posInicial, (posFinal + 1)));
        */
        /* 
        char myString = ' ';
        for(int i = 0; i < cadena.length(); i++){
            myString = cadena.charAt(i);
            total = myString+total;
        }
        System.out.println(total);
*/
String anio = cadena.substring(0, 4);
String mes = cadena.substring(5, 7);
String dia = cadena.substring(8, 10);

System.out.println(anio + "-" + mes + "-" + dia);
     
        


    }
    
}
