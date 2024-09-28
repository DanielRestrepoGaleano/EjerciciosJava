/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner teclado = new Scanner(System.in);
        double origen, impuesto, costo, venta;
        String marca;
        System.out.println("Ingrese la marca por favor: ");
        marca = teclado.nextLine();
        System.out.println("Ingrese el origen por favor 1. Alemania, 2. Japón, 3. italia, 4. EUA");
        origen = teclado.nextInt();
        System.out.println("Ingrese el costo por favor");
        costo = teclado.nextInt();
        if (origen == 1) {
            impuesto = costo * 0.20;
            venta = costo + impuesto;
            System.out.println("El valor del vehículo es: " + venta);
        } else {
            if (origen == 2) {
                impuesto = costo * 0.30;
                venta = costo + impuesto;
                System.out.println("El valor del vehículo es: " + venta);
            } else {
                if (origen == 3) {
                    impuesto = costo * 0.15;
                    venta = costo + impuesto;
                    System.out.println("El valor del vehículo es: " + venta);
                } else {
                    if (origen == 4) {
                        impuesto = costo * 0.8;
                        venta = costo + impuesto;
                        System.out.println("El valor del vehículo es: " + venta);
                        teclado.close();
                    }
                }
            }
        }
    }
}
