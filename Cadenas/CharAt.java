package Cadenas;
import java.util.Scanner;
public class CharAt {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una cadena, para calcular un número narcisita");
        cadena = teclado.nextLine();

        int cantCifras = 0;
        int suma = 0;
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.charAt(i));
            cantCifras = cantCifras++;
        }


        




//Capturar un número y determinar si es narcisista.








    }
    
}
