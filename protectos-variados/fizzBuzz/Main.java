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
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el numero que desee evaluar");
		int n = teclado.nextInt();
		
		for (int i = 1;i <= n ;i++ ){
		    
		    if (i % 3 == 0){
		        System.out.println(" Fizz ");
		    
		        
		    }else if(i % 5 == 0){
		        System.out.println(" Buzz ");
		        
		    }else if(i % 3 == 0 && i % 5 == 0){
		        System.out.println("FizzBuzz");
		        
		    }else{
		        System.out.println(i);
		        
		    } 
		    
		      
		    
		    
		    
		} 
		 
		
		
	}
}
