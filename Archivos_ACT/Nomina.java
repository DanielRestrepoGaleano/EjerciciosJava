package Archivos_ACT;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Nomina {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        do {

            System.out.println("Seleccione\n1: Adicionar trabajador\n2: Mostrar\n3: Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    mostrarMenu();
                    break;
                case 2:
                leer();
                 break;
            }
        } while (opc < 3);

    }

    public static void leer() {
        try {
            FileReader fileReader = new FileReader("nomina.txt");
            int caracter = 0;
            while (caracter != -1) {
                caracter = fileReader.read();
                char letra = (char) caracter;

                System.out.print(letra);

            }
            fileReader.close();
        } catch (IOException err) {
            System.out.println("Error al leer el archivo");
        }
    }

    public static void mostrarMenu() {
        try {
            Scanner teclado = new Scanner(System.in);
            String cedula;
            String nombre;
            int netoPagado = 0;
            float salarioMensual = 0;
    
            int diasTrabajados = 0;
            int auxilioTransporte = 0;
            String registrarTrabajador;
            int pago = 0;
            int pago2 = 0;
            System.out.println("\t---> MENÚ TRABAJADORES <---\n");
            System.out.println("Ingrese el nombre del trabajador ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese la cédula del trabajador " + nombre);
            cedula = teclado.nextLine();
            System.out.println("Ingrese los días trabajados del trabajador " + nombre);
            diasTrabajados = teclado.nextInt();
            System.out.println("Ingrese el salario mensual del trabajador " + nombre);
            salarioMensual = teclado.nextInt();
    
          
            if (salarioMensual >= 2600000) {
               
                pago2 = calcularSalarioBasico(diasTrabajados, salarioMensual);
                netoPagado = pago2;
            } else {
                auxilioTransporte = calcularAuxilioTransporte(diasTrabajados, (int) salarioMensual);
                pago2 = calcularSalarioBasico(diasTrabajados, salarioMensual);
                netoPagado = pago2 + auxilioTransporte;
            }
    
            registrarTrabajador = nombre + " " + cedula + " " + " su paga es de " + netoPagado;
            FileWriter filewriter = new FileWriter("nomina.txt", true);
            filewriter.write("\n");
            for (int i = 0; i < registrarTrabajador.length(); i++) {
                filewriter.write(registrarTrabajador.charAt(i));
            }
    
            filewriter.close();
        } catch (IOException err) {
            System.out.println("Error al leer el archivo");
        }
    }

    public static int calcularSalarioBasico(int diasTrabajados, float salarioMensual) {
        int salarioBasico = 0;
            int calcularSalarios = 0;
            calcularSalarios = calcularAuxilioTransporte(diasTrabajados, salarioMensual);
            salarioBasico = (int) ((salarioMensual / 30 * diasTrabajados) + calcularSalarios);
        
        return salarioBasico;
    }

    
    public static int calcularAuxilioTransporte(int diasTrabajados, float salarioMensual) {
        int auxilioTransporte = 0;

        if (salarioMensual < 2600000) {
            auxilioTransporte = (162000 * diasTrabajados) / 30;
        }else{
            auxilioTransporte = 0;
        }
        return auxilioTransporte;


}
}