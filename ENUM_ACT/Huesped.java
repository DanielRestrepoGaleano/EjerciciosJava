package ENUM_ACT;

import java.util.*;

public class Huesped {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LinkedList<EnumAct> huesped = new LinkedList<EnumAct>();
        String opcion;
        String respuesta = "";
        int noches = 0;
        int cantAcomp = 0;
        int maxHuespedes = 0;
        EnumAct habitacionMaxHuespedes = null;

        while (true) {
            System.out.println("Ingrese el tipo de habitación");
            System.out.println("SENCILLA / DOBLE / MULTIPLE / SUIETE");
            opcion = teclado.next().toUpperCase();
            System.out.println("Ingrese el total de noches de servicio");
            noches = teclado.nextInt();
            System.out.println("Ingrese la cantidad de acompañantes");
            cantAcomp = teclado.nextInt();

            EnumAct huesp = Enum.valueOf(EnumAct.class, opcion);
            System.out.println("Ingrese su nombre ");
            String nombre = teclado.next();

            double valorTotal = 0;

            valorTotal += huesp.getValor() * noches * cantAcomp;
            System.out.println("El valor total es: " + valorTotal);

            double prom = 0;
            prom = valorTotal / (cantAcomp);
            System.out.println("El promedio es: " + prom);
            System.out.println("Por habitacion debe pagar " + valorTotal / (noches * cantAcomp));
            System.out.println("Por el servicio de habitación " + huesp.name());
            huesped.add(huesp);

            if (cantAcomp > maxHuespedes) {
                maxHuespedes = cantAcomp;
                habitacionMaxHuespedes = huesp;
            }

            System.out.println("Desea ingresar otro huésped? (S/N)");
            respuesta = teclado.next().toUpperCase();
            if (respuesta.equals("N")) {
                break;
            }
        }

        System.out.println("La habitación con más huéspedes es " + habitacionMaxHuespedes.name() + " con " + maxHuespedes + " personas");
    }
}