/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
		final int TAM = 10;
		
		int num[] = new int[TAM];
		Scanner teclado = new Scanner(System.in);
		rellenarArray(num, teclado);
		mostrarArray(num);
		
	}
	
	public static void rellenarArray(int lista[], Scanner teclado){
	    for (int i = 0; i < lista.length ;i++ ){
	        System.out.println("Por favor ingrese el número");
	        lista[i] = teclado.nextInt();
	    } 
	}
	
	public static void mostrarArray(int lista[]){
	    for(int i = 0; i < lista.length; i++){
	        System.out.println("En el indice "+i+" esta el valor "+lista[i]);
	        
	    }
	}
	
	
	
	
}