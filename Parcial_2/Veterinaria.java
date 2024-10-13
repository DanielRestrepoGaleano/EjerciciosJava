package Parcial_2;

import java.util.*;

public class Veterinaria {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        String nombreMascota = "";
        String raza = "";
        String especie = "";
        String edadAux = "";
        int edad = 0;
        String salir = "";

        while (true) {
            try {
                // Entrada de datos por separado para mayor control de errores
                do {
                    System.out.println("\n\t-----/ Menú \\-----");
                    System.out.println("\n\tDatos del dueño");
                    System.out.println("Por favor ingrese el nombre del dueño");
                    nombre = teclado.nextLine().toLowerCase();
                    if (!validarNombre(nombre)) {
                        System.out.println("El nombre ingresado no es válido");
                    }
                } while (!validarNombre(nombre));

                do {
                    System.out.println("\n\tDatos de la mascota de " + nombre);
                    System.out.println("Ingrese el nombre de la mascota");
                    nombreMascota = teclado.nextLine().toLowerCase();
                    if (!validarNombreMascota(nombreMascota)) {
                        System.out.println("El nombre de la mascota no es válido");
                    }
                } while (!validarNombreMascota(nombreMascota));

                do {
                    System.out.println("\nIngrese la raza del animal");
                    raza = teclado.nextLine().toLowerCase();
                    if (!validarRaza(raza)) {
                        System.out.println("La raza ingresada no es válida");
                    }
                } while (!validarRaza(raza));

                VeterinariaEnum especieEnum = null;
                do {
                    System.out.println("\nIngrese la especie de la mascota");
                    for (VeterinariaEnum ve : VeterinariaEnum.values()) {
                        System.out.println(ve);
                    }
                    especie = teclado.nextLine().toUpperCase();
                    if (!validarEspecie(especie)) {
                        System.out.println("La especie ingresada no es válida");
                    } else {
                        especieEnum = VeterinariaEnum.valueOf(especie);
                    }
                } while (especieEnum == null);

                do {
                    System.out.println("\nIngrese la edad de la mascota en días");
                    edadAux = teclado.nextLine().toLowerCase();
                    if (validarEdadAux(edadAux)) {
                        edad = Integer.parseInt(edadAux);
                        String edadFormateada = formatearEdad(edad);
                        System.out.println("La edad de la mascota es: " + edadFormateada);
                        System.out.println("¿Es esta edad correcta? (S/N)");
                        String respuesta = teclado.nextLine().toUpperCase();
                        if (respuesta.equalsIgnoreCase("N")) {
                            edad = 0;
                        }
                    } else {
                        System.out.println("La edad ingresada no es válida");
                    }
                } while (edad == 0);

                // Objetos "mascota" y "cliente"
                Mascota mascota = new Mascota(nombreMascota, raza, especieEnum, edad);
                Cliente cliente = new Cliente(nombre, mascota);
                clientes.add(cliente);

                // Salir del loop infinito
                System.out.println("\nDesea ingresar otro cliente (S/N)");
                salir = teclado.nextLine().toUpperCase();
                if (salir.equals("N")) {
                    break;
                }
                // 3 casos de excepcioness
            } catch (NoSuchElementException err) {
                System.out.println("Error al leer la entrada del usuario");
                break;
            } catch (IllegalArgumentException err) {
                System.out.println("Error al ingresar datos");
            } catch (Exception err) {
                System.out.println("Error inesperado");
            }

        }
        // Mostrar todos los clientes con sus respectivas mascotas
        for (Cliente cliente : clientes) {
            System.out.println("\nDueño: " + cliente.getNombre());
            Mascota mascota = cliente.getMascota();
            System.out.println("Mascota: " + mascota.getNombre() + ", Especie: " + mascota.getEspecie() +
                    ", Raza: " + mascota.getRaza() + ", Edad: " + formatearEdad(mascota.getEdad()));
        }
    }

    // Realizar todas las vvalidaciones necesarias
    public static boolean validarNombre(String nom) {
        return nom.matches("[a-z]+");
    }

    public static boolean validarNombreMascota(String nom) {
        return nom.matches("[a-z]+");
    }

    public static boolean validarRaza(String raza) {
        return raza.matches("[a-z]+");
    }

    public static boolean validarEspecie(String especie) {
        for (VeterinariaEnum v : VeterinariaEnum.values()) {
            if (v.name().equalsIgnoreCase(especie)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarEdadAux(String ed) {
        return ed.matches("[0-9]+");
    }

    // Darle formato a la fecha de DD/MM/AAAA. Al solo contar los días podemos
    // asumir que todos tienen 30 días
    public static String formatearEdad(int edad) {
        int años = edad / 365;
        int meses = (edad % 365) / 30;
        int días = (edad % 365) % 30;
        return años + " años, " + meses + " meses y " + días + " días";
    }
}