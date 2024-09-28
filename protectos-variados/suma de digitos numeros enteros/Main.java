import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un numero");
        int n = teclado.nextInt();
        
        List<Integer> digitlist = new ArrayList<>();
        collectDigits(n, digitlist);
        
        System.out.println("Los dígitos del número son: " + digitlist);
        
        
          int sum = 0;
        for(int digit : digitlist) {
            sum += digit;
        }
        
        System.out.println("La suma de los dígitos es: " + sum);
    }
    
    public static void collectDigits(int n, List<Integer> digitlist) {
        if (n / 10 > 0) {
            collectDigits(n / 10, digitlist);
        }
        digitlist.add(n % 10);
    }
    
    
    
    
    
    
    
}
