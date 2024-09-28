/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
	import java.util.Scanner;
	public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double numero1 = teclado.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double numero2 = teclado.nextDouble();

        System.out.println("Ingrese el tercer número: ");
        double numero3 = teclado.nextDouble();

        System.out.println("Ingrese el cuarto número: ");
        double numero4 = teclado.nextDouble();

        double mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        if (numero4 > mayor) {
            mayor = numero4;
        }

        System.out.println("El número mayor es: " + mayor);

        teclado.close();
    }
}
