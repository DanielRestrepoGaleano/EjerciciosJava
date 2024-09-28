package calculadora;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Operaciones oper = new Operaciones(0 , 0,  0);
		double n1, n2, res;
		
		
		while (true) {
			System.out.println("1. para sumar dos numeros");
			System.out.println("2. para restar dos numeros");
			System.out.println("3. para multiplicar dos numeros");
			System.out.println("4. para dividir dos numeros");
			System.out.println("4. seleccione su opción");
			System.out.println("0. para salir");
			int opc = teclado.nextInt();
			oper.setOpcion(opc);
			if(opc == 1) {
				System.out.println("Ingrese los dos datos a sumar");
				n1 = teclado.nextDouble();
				n2 = teclado.nextDouble();
				oper.setNum1(n1);
				oper.setNum2(n2);
				oper.getResultado();
				System.out.println("El resultado es: " + oper.Operacion() );
				System.out.println("El metodo toString es: " + oper.toString() );
			if(opc == 2) {
				System.out.println("Ingrese los dos datos a sumar");
				n1 = teclado.nextDouble();
				n2 = teclado.nextDouble();
				oper.setNum1(n1);
				oper.setNum2(n2);
				oper.getResultado();
				System.out.println("El resultado es: " + oper.Operacion() );
				
				
			}
				
				
			}
			
			
			
			
			
			
			
			
		}
			
			
			
		
		
		
		
		
		

	}

}
