/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    while(true){
	        
	    
		int minutos, segundos = 60;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese los minutos");
		minutos = teclado.nextInt();

		segundos = minutos * segundos;


		System.out.println("Los segundos son " + segundos);

	        System.out.println("Desea ingresar otro dato /S/N");
	        String opcion = teclado.next().toUpperCase();
	        if(opcion.equals("N")){
	            break;
	        }
	    }

	}
}
