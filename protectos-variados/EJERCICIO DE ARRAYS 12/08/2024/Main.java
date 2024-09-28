import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor ingrese el número de filas");
        int filas = teclado.nextInt();
        System.out.println("Por favor ingrese el número de columnas");
        int columnas = teclado.nextInt();

        String[][] salaCine = new String[filas][columnas];
        int cantidadAsientos = filas * columnas;
        int asientosOcupados = 0;
        int totalRecaudado = 0;

        // Inicializar la sala con "D" (disponible)
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                salaCine[i][j] = "D";
                System.out.print(salaCine[i][j] + " ");
            }
            System.out.println();
        }

        // Determinar la mitad de las filas
        int mitad = filas / 2;

        while (asientosOcupados < cantidadAsientos) {
            System.out.println("Por favor seleccione la fila");
            int f = teclado.nextInt();
            System.out.println("Por favor seleccione la columna");
            int c = teclado.nextInt();

            if (f >= 0 && f < filas && c >= 0 && c < columnas) {
                if (salaCine[f][c].equals("X")) {
                    System.out.println("Intente otra posición, esta ya está tomada");
                } else {
                    salaCine[f][c] = "X";
                    asientosOcupados++;

                    // Calcular el precio según la ubicación y cantidad de asientos
                    int precio;
                    if (cantidadAsientos >= 30) {
                        if (f < mitad) {
                            precio = 7500;  // Precio para la mitad superior
                        } else {
                            precio = 12000;   // Precio para la mitad inferior
                        }
                    } else {
                        precio = 8000;  // Precio único para menos de 30 asientos
                    }
                    totalRecaudado += precio;
                    System.out.println("El precio del asiento es: $" + precio);
                }
            } else {
                System.out.println("Coordenadas inválidas. Intente nuevamente.");
            }

            // Mostrar estado actual de la sala
            System.out.println("Estado actual de la sala:");
            for (int k = 0; k < filas; k++) {
                for (int l = 0; l < columnas; l++) {
                    System.out.print(salaCine[k][l] + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Todos los asientos están ocupados.");
        System.out.println("Total recaudado: $" + totalRecaudado);
        teclado.close();
    }
}
