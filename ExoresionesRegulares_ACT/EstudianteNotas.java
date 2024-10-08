package ExoresionesRegulares_ACT;

import java.util.Scanner;

public class EstudianteNotas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String IdentificacionAux;
        int identificación;
        String nombre;
        float nota1;
        float nota2;
        float nota3;
        String nota1Aux, nota2Aux, nota3Aux;

        // VALIDAR EL NOMBRE
        do {
            System.out.println("por favor ingrese su nombre");
            nombre = teclado.next().toLowerCase();
            if (!validarNombre(nombre)) {
                System.out.println("nombre invalido");
            }
        } while (validarNombre(nombre) == false);

        // VALIDAR LA IDENTIFICACIÓN
        do {
            System.out.println("Ingrese la identificación");
            IdentificacionAux = teclado.next().toLowerCase();
            if (!validarIdentificacion(IdentificacionAux)) {
                System.out.println("identificación invalida");
            }
        } while (validarIdentificacion(IdentificacionAux) == false);
        identificación = Integer.parseInt(IdentificacionAux);

        // VALIDAR NOTAS

        do {
            System.out.println("Ingrese su primer nota");
            nota1Aux = teclado.next().toLowerCase();
            if (!validarNota1(nota1Aux)) {
                System.out.println("Nota 1 invalida");
            }
        } while (validarNota1(nota1Aux) == false);
        nota1 = Float.parseFloat(nota1Aux);
        do {
            System.out.println("Ingrese su segunda nota");
            nota2Aux = teclado.next().toLowerCase();
            if (!validarNota2(nota2Aux)) {
                System.out.println("Nota 2 invalida");
            }
        } while (validarNota2(nota2Aux) == false);
        nota2 = Float.parseFloat(nota2Aux);
        do {
            System.out.println("Ingrese su tercera nota");
            nota3Aux = teclado.next().toLowerCase();
            if (!validarNota3(nota3Aux)) {
                System.out.println("Nota 3 invalida");
            }
        } while (validarNota3(nota3Aux) == false);

        nota3 = Float.parseFloat(nota3Aux);

        // Calcular la nota definitiva
        float notaDefinitiva = (nota1 + nota2 + nota3) / 3;

         System.out.println("EL estudiante " + nombre + " con identificacion " +
         identificación +
         " tiene una nota definitiva de " + notaDefinitiva);

    }

    public static boolean validarNombre(String nom) {
        return nom.matches("[a-z]+");
    }

    public static boolean validarIdentificacion(String id) {
        return id.matches("[0-9]{8,10}+");
    }

    public static boolean validarNota1(String n1) {
        return n1.matches("[\\d.]{1,3}+");

    }

    public static boolean validarNota2(String n2) {
        return n2.matches("[\\d.]{1,3}+");

    }

    public static boolean validarNota3(String n3) {
        return n3.matches("[\\d.]{1,3}+");

    }
}
