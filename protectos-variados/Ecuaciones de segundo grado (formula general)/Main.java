/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Programa para resolver por formula general:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double a, b, c;
	    double x1, x2, d;
	    
	    
	    Scanner teclado = new Scanner(System.in);
	    
	    
	    System.out.println("Ingrese el primer coeficiente (a)");
	    a = teclado.nextDouble();
	    
	    System.out.println("Ingrese el seungod coeficiente (b)");
	    b = teclado.nextDouble();
	    
	    
	    System.out.println("Ingrese el tercer coeficiente (c)");
	    c = teclado.nextDouble();
	   
	    
	    
	    //Calcular el determinante por medio de la formula cuadratica
	    
	    d =((b*b) -4*a*c );
	    
	    if(d<0){
	        System.out.println("No existen solucion en los reales");
	    }else {
	        x1 = (-b+Math.sqrt(d)) / (2 * a);
	        x2 = (-b-Math.sqrt(d)) / (2 * a);
	        System.out.println("La solución 1: " + x1);
	        System.out.println("La solución 2: " + x2);
	    }
	    
	    
		
		    
	}
}
