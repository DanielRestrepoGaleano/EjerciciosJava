import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el numero maximo para evaluar");
        int n = teclado.nextInt();
        
        boolean esPrimo = true; // Definir la variable esPrimo aquí
        
        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        if (esPrimo) {
            System.out.println(n + " es un numero primo");
        } else {
            System.out.println(n + " no es un numero primo");
        }
    }
}
