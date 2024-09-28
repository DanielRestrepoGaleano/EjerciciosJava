import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Operaciones> operations = new ArrayList<>();

        while (true) {
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("0. Salir");
            int opc = teclado.nextInt();

            if (opc == 0) {
                break;
            }

            Operaciones oper = new Operaciones();
            oper.setOpcion(opc);

            System.out.println("Ingrese los dos datos");
            double n1 = teclado.nextDouble();
            double n2 = teclado.nextDouble();
            oper.setNum1(n1);
            oper.setNum2(n2);

            oper.setResultado(oper.operacion());
            System.out.println("El resultado es: " + oper.getResultado());
            System.out.println("El método toString es: " + oper.toString());

            operations.add(oper);
        }

        // Print all operations
        for (Operaciones op : operations) {
            System.out.println(op.toString());
        }
    }
}